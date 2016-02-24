package com.example.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectLogger {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Pointcut("execution(* com..*.*IndexController.*(..))")
	public void indexCall() {
	}

	@Before("indexCall()")
	public void beforeMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		logger.info(String.format("aop test ..  advice.beforeMethod %s.. ", methodName));
	}

	@After("indexCall()")
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		logger.info(String.format("aop test ..  advice.afterMethod %s.. ", methodName));
	}

//	@Around("indexCall()")
//	public void aroundMethod(JoinPoint joinPoint) {
//		String methodName = joinPoint.getSignature().getName();
//		logger.info(String.format("aop test ..  advice.aroundMethod %s.. ", methodName));
//	}
}
