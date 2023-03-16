package com.springcourse.spring.basics.springin5steps;

import com.springcourse.spring.basics.springin5steps.basic.BinarySearchImp;
import com.springcourse.spring.basics.springin5steps.scope.PersonDAO;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springcourse.spring.basics.springin5steps")
public class SpringIn5StepsScopeApplication {
	private static Logger LOGGER =  LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);
//				SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());

		LOGGER.info("{}",personDAO2);
		LOGGER.info("{}",personDAO2.getJdbcConnection());
	}

}
