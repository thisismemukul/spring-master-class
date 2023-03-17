package com.springframework.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class AfterAopAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());	
	//What kind of method calls I would intercept
	//execution(* PACKAGE.*.*(..))
	//Weaving & Weaver
	@AfterReturning(
			value="execution(* com.springframework.spring.aop.springaop.business.*.*(..))",
			returning="result"
			)
	public void afterReturning(JoinPoint joinPoint,Object result) {
		//advice
		logger.info("{} returned with value {}",joinPoint,result);
	}
	@AfterThrowing(
			value="execution(* com.springframework.spring.aop.springaop.business.*.*(..))",
			throwing="exception"
			)
	public void afterThrowing(JoinPoint joinPoint,Object exception) {
		//advice
		logger.info("{} throw eception {}",joinPoint,exception); //rn no exception is there
	}
	@After(value="execution(* com.springframework.spring.aop.springaop.business.*.*(..))")
	public void after(JoinPoint joinPoint) {
		//advice
		logger.info("after execution of {}",joinPoint);
	}
}
