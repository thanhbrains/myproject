package com.ttx.my.spring.boot.data.jpa.thymleaf.utils;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Id;

/**
 * @author thanh
 *
 */

public class EntityDtoHelper {

	static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
	static Set<Class<?>> classes = new HashSet<Class<?>>();
	static {
		classes.add(boolean.class);
		classes.add(byte.class);
		classes.add(short.class);
		classes.add(int.class);
		classes.add(long.class);
		classes.add(float.class);
		classes.add(double.class);
		classes.add(char.class);
		classes.add(Boolean.class);
		classes.add(Byte.class);
		classes.add(Short.class);
		classes.add(Integer.class);
		classes.add(Long.class);
		classes.add(Float.class);
		classes.add(Double.class);
		classes.add(String.class);
		classes.add(Date.class);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <E, D> D singleMapper(E obj, Class<D> clazz) {
		try {
			Field[] fieldsObj = obj.getClass().getDeclaredFields();
			Object objTarget = clazz.newInstance();
			for (Field fieldObj : fieldsObj) {
				Field fieldObjTarget = null;

				// Check if not field equals
				try {
					fieldObjTarget = clazz.getDeclaredField(fieldObj.getName());
				} catch (Exception e) {
					e.printStackTrace();
					continue;
				}

				fieldObjTarget.setAccessible(true);
				fieldObj.setAccessible(true);
				if (fieldObj.get(obj) instanceof Collection) {
					if (fieldObj.get(obj) instanceof Set) {
						Set setChids = (Set) fieldObj.get(obj);
						ParameterizedType parameterizedType = (ParameterizedType) fieldObjTarget.getGenericType();
						Class classChidTarget = (Class) parameterizedType.getActualTypeArguments()[0];
						Set setChidsobjTarget = new HashSet();
						for (Object chid : setChids) {
							Object chidsobjTarget = singleMapper(chid, classChidTarget, obj.getClass(), true);
							setChidsobjTarget.add(chidsobjTarget);
						}
						fieldObjTarget.set(objTarget, setChidsobjTarget);
						continue;
					}
				}
				if (iSPrimitiveType(fieldObj.getType())) {
					Object objectExpect = getExpectValue(fieldObjTarget.getType(), fieldObj.getType(),
							fieldObj.get(obj));
					if (objectExpect != null) {
						fieldObjTarget.set(objTarget, objectExpect);
						continue;
					}
				}
				Object individualObj = singleMapper(fieldObj.get(obj), fieldObjTarget.getType(), obj.getClass(), true);
				fieldObjTarget.set(objTarget, individualObj);
			}
			return (D) objTarget;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static <E, D> List<D> listMapper(List<E> objs, Class<D> clazz) {
		List<D> ds = new ArrayList<D>();
		for (E e : objs) {
			D d = singleMapper(e, clazz);
			ds.add(d);
		}
		return ds;
	}

	@SuppressWarnings("unchecked")
	private static <E, D> D singleMapper(E obj, Class<D> clazz, Class<?> superClass, boolean ignor) {
		try {
			Field[] fieldsObj = obj.getClass().getDeclaredFields();
			Object objTarget = null;
			for (Field fieldObj : fieldsObj) {
				if (classes.contains(clazz)) {
					Field[] fields = obj.getClass().getDeclaredFields();
					for (Field field : fields) {
						field.setAccessible(true);
						Annotation[] annotations = field.getAnnotations();
						for (Annotation ann : annotations) {
							if (ann instanceof Id) {
								Object objectExpect = getExpectValue(clazz, field.getType(), field.get(obj));
								if (objectExpect != null) {
									return (D) objectExpect;
								}
							}
						}
					}
				}

				objTarget = clazz.newInstance();
				Field fieldObjTarget = clazz.getDeclaredField(fieldObj.getName());
				fieldObj.setAccessible(true);
				fieldObjTarget.setAccessible(true);
				if (fieldObj.getType().getName().equals(superClass.getName())) {
					continue;
				}
				if (fieldObj.get(obj) instanceof Collection) {
					if (ignor) {
						continue;
					}
				}
				if (iSPrimitiveType(fieldObj.getType())) {
					Object objectExpect = getExpectValue(fieldObjTarget.getType(), fieldObj.getType(),
							fieldObj.get(obj));
					if (objectExpect != null) {
						fieldObjTarget.set(objTarget, objectExpect);
						continue;
					}
				}
			}
			return (D) objTarget;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	static boolean iSPrimitiveType(Class<?> clazz) {
		return classes.contains(clazz);
	}

	static Object getExpectValue(Class<?> clazztarget, Class<?> clazz, Object obj) throws ParseException {

		if (clazztarget.getName().equals(Byte.class.getName()) || clazztarget.getName().equals(byte.class.getName())) {
			if (clazz.getName().equals(String.class.getName())) {
				return Byte.valueOf((String) obj);
			}
			return (Byte.valueOf(obj.toString()));
		}
		if (clazztarget.getName().equals(Short.class.getName())
				|| clazztarget.getName().equals(short.class.getName())) {
			if (clazz.getName().equals(String.class.getName())) {
				return Short.valueOf((String) obj);
			}
			return (Short.valueOf(obj.toString()));
		}
		if (clazztarget.getName().equals(Integer.class.getName())
				|| clazztarget.getName().equals(int.class.getName())) {
			if (clazz.getName().equals(String.class.getName())) {
				return Integer.valueOf((String) obj);
			}
			return (Integer.valueOf(obj.toString()));
		}
		if (clazztarget.getName().equals(Long.class.getName()) || clazztarget.getName().equals(long.class.getName())) {
			if (clazz.getName().equals(String.class.getName())) {
				return Long.valueOf((String) obj);
			}
			return (Long.valueOf(obj.toString()));
		}
		if (clazztarget.getName().equals(Float.class.getName())
				|| clazztarget.getName().equals(float.class.getName())) {
			if (clazz.getName().equals(String.class.getName())) {
				return Float.valueOf((String) obj);
			}
			return (Float.valueOf(obj.toString()));
		}
		if (clazztarget.getName().equals(Double.class.getName())
				|| clazztarget.getName().equals(double.class.getName())) {
			if (clazz.getName().equals(String.class.getName())) {
				return Double.valueOf((String) obj);
			}
			return (Double.valueOf(obj.toString()));
		}
		if (clazztarget.getName().equals(String.class.getName())) {
			if (clazz.getName().equals(Date.class.getName())) {
				return dateFormat.format(obj);
			}
			return String.valueOf(obj);
		}
		if (clazztarget.getName().equals(Date.class.getName())) {
			if (clazz.getName().equals(String.class.getName())) {
				return dateFormat.parse((String) obj);
			}
			return (Date) obj;
		}

		if (clazztarget.getName().equals(char.class.getName())) {
			return (char) obj;
		}
		if (clazztarget.getName().equals(Boolean.class.getName())
				|| clazztarget.getName().equals(boolean.class.getName())) {
			if (clazz.getName().equals(String.class.getName())) {
				return Boolean.valueOf((String) obj);
			}
			return (Boolean.valueOf(obj.toString()));
		}
		return null;
	}

	public static void generateDtoFromEntity(String packageEntity, String packageDto) throws Exception {

		String pathEntity = getFolderPath(packageEntity);
		String pathDto = getFolderPath(packageDto);
		File[] fileEntitys = new File(pathEntity).listFiles();
		for (File file : fileEntitys) {
			if (file.getName().contains(".java")) {
				Set<String> classNameEntitys = new HashSet<String>();
				String className = file.getName();
				className = className.replace(".java", "");
				classNameEntitys.add(className);
				Class<?> clazz = Class.forName(packageEntity + "." + className);
				Field[] fields = clazz.getDeclaredFields();

				// File entity class
				for (Field field : fields) {
					if (!classes.contains(field.getType())) {
						Class<?> returnType = field.getType();
						if (returnType.getName().equals(List.class.getName())
								|| returnType.getName().equals(Set.class.getName())) {
							ParameterizedType type = (ParameterizedType) field.getGenericType();
							Class<?> actType = (Class<?>) type.getActualTypeArguments()[0];
							classNameEntitys
									.add(actType.getName().split("[.]")[actType.getName().split("[.]").length - 1]);

						} else {
							classNameEntitys.add(field.getType().getName()
									.split("[.]")[field.getType().getName().split("[.]").length - 1]);
						}
					}
				}

				// write dto
				String content = new String(Files.readAllBytes(Paths.get(pathEntity + "/" + file.getName())));
				content = content.replace(packageEntity, packageDto);
//				content = content.replace("@javax.persistence.Id", "");
				content = content.replaceAll("@Id", "");
				for (String entityName : classNameEntitys) {
					content = content.replace(entityName, entityName + "DTO");
				}
				Files.write(Paths.get(pathDto + "/" + className + "DTO.java"), content.getBytes());
			}
		}

	}

	static String getFolderPath(String packageName) {
		String rootPath = System.getProperty("user.dir") + "/src/main/java/";
		packageName = rootPath + packageName;
		String[] strings = packageName.split("[\\\\/.]");
		String path = strings[0] + "/";
		for (int i = 1; i < strings.length; i++) {
			if (i == strings.length - 1) {
				path += strings[i];
			} else {
				path += strings[i] + "/";
			}
		}
		return path;
	}

	public static void main(String[] args) throws Exception {
		generateDtoFromEntity("com.ttx.my.spring.boot.data.jpa.thymleaf.entity",
				"com.ttx.my.spring.boot.data.jpa.thymleaf.domain");
	}
}