package com.ttx.my.spring.boot.data.jpa.thymleaf.configure;

import java.lang.reflect.Method;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.MessageSourceResourceBundleLocator;

@Aspect
@Component
public class ValidInterceptor {

	ValidatorFactory factory;
	Validator validator;
	@Autowired
	MessageSource messageSource;
	
	@Around(value="@annotation(com.ttx.my.spring.boot.data.jpa.thymleaf.utils.TargetCheck)")
	public Object handler(ProceedingJoinPoint joinPoint) throws Throwable{
		
		if (factory == null) {
			factory = Validation
					.byDefaultProvider()
					.configure()
					.messageInterpolator(
							new ResourceBundleMessageInterpolator(new MessageSourceResourceBundleLocator(messageSource)))
					.buildValidatorFactory();
			validator = factory.getValidator();
		}
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method =  signature.getMethod();
		System.out.println(method.getName());
		return joinPoint.proceed();
	}
}
