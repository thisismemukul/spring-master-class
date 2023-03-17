package com.springframework.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springframework.spring.aop.springaop.aspect.TrackTime;

@Repository
public class Dao1 {
	@TrackTime
	public String retriveSomething() {
		return "Dao1";
	}

}
