package com.springframework.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJointPointConfig {
	
	@Pointcut("execution(* com.springframework.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {
		
	}
	@Pointcut("execution(* com.springframework.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {
		
	}

}
