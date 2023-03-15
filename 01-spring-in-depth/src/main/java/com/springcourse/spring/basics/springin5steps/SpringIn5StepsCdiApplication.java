package com.springcourse.spring.basics.springin5steps;

import com.springcourse.spring.basics.springin5steps.cdi.SomeCdiBusiness;
import com.springcourse.spring.basics.springin5steps.cdi.SomeCdiDao;
import com.springcourse.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsCdiApplication {
	private static Logger LOGGER =  LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);
	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCdiApplication.class, args);
		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);
		LOGGER.info("{} dao-{}",business, business.getSomeCDIDAO());
	}

}
