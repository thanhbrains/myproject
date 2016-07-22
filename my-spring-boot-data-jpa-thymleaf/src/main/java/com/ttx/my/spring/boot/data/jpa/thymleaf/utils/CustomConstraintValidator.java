package com.ttx.my.spring.boot.data.jpa.thymleaf.utils;

import java.lang.annotation.Annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.hibernate.validator.constraintvalidation.HibernateConstraintValidatorContext;
import org.springframework.context.ApplicationContext;

/**
 * @author thanh.nv
 */
public class CustomConstraintValidator implements
		ConstraintValidator<Valid, Object> {

	Annotation ann;
	ApplicationContext context;

	@Override
	public void initialize(Valid arg0) {
	}

	@Override
	public boolean isValid(Object arg0, ConstraintValidatorContext arg1) {

		boolean stepBystep = (((Valid) ann).stepBystep());
		System.out.println(context);
		if (arg0 instanceof Object) {
			if (!stepBystep) {
				int count = 0;
				HibernateConstraintValidatorContext validatorContext = arg1
						.unwrap(HibernateConstraintValidatorContext.class);
				validatorContext.disableDefaultConstraintViolation();

				validatorContext.addExpressionVariable("value", "valu");
				validatorContext
						.buildConstraintViolationWithTemplate("{message.com}")
						.addPropertyNode("vl").addConstraintViolation();
				count++;
				validatorContext.addExpressionVariable("value", "valu1");
				validatorContext
						.buildConstraintViolationWithTemplate("{message.com}")
						.addPropertyNode("vl2").addConstraintViolation();
				if (count > 0) {
					return false;
				}
			} else {

			}
		}
		return true;
	}
}
