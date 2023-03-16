package com.springframework.spring.aop.springaop;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class Dao1 {
	public String retriveSomething() {
		return "Dao1";
	}

}
