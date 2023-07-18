package com.iemr.ecd.utils.aop.logging_advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class LoggingAdvice {

	Logger logger = LoggerFactory.getLogger(this.getClass().getName());

	@Around("execution(* com.iemr.ecd.controller.*.*.*(..))")
	public Object applicationLogger(ProceedingJoinPoint pjp) throws Throwable {

		ObjectMapper mapper = new ObjectMapper();
		String methodName = pjp.getSignature().getName();
		String className = pjp.getTarget().getClass().toString();

		Object[] objArr = pjp.getArgs();

		logger.info("request : " + mapper.writeValueAsString(objArr) + " className : " + className + " methodName :"
				+ methodName);

		Object object = pjp.proceed();

		logger.info("response" + mapper.writeValueAsString(object));

		return object;
	}

}
