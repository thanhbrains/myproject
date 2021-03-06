package com.ttx.my.spring.boot.data.jpa.thymleaf.utils;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * 
 * @author thanh
 *
 */

@Documented
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, PACKAGE })
@Constraint(validatedBy = CustomConstraintValidator.class)
public @interface Valid {

	String message() default "{}";

	boolean stepBystep() default true;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
