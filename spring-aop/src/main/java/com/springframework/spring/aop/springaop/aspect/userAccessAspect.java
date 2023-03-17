package com.springframework.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class userAccessAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());	
	//What kind of method calls I would intercept
	//execution(* PACKAGE.*.*(..))
	//Weaving & Weaver
	@Before("execution(* com.springframework.spring.aop.springaop.data.*.*(..))")
	public void before(JoinPoint joinPoint) {
		//advice
		logger.info("Checkfor user access");
		logger.info("Intercepted method call - {}",joinPoint);
	}
}
