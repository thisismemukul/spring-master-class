package com.springcourse.spring.basics.springin5steps;

import com.springcourse.spring.basics.componentscan.ComponentDAO;
import com.springcourse.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springcourse.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {
	private static Logger LOGGER =  LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);
	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);
//				SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("{}",componentDAO);
	}

}
