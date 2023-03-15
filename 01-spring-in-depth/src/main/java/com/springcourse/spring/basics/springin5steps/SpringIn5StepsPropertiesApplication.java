package com.springcourse.spring.basics.springin5steps;

import com.springcourse.spring.basics.springin5steps.basic.BinarySearchImp;
import com.springcourse.spring.basics.springin5steps.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springcourse.spring.basics.springin5steps")
//app.properties
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {
//Step 1 - Setting up a Java Spring Project using htttp://start.spring.io
	//What are beans?
	//What are the dependencies of  a bean?
//	Where to search for a beans? => no need
	public static void main(String[] args) {

		//BinarySearchImp binarySearch= new BinarySearchImp(new QuickSortAlgorithm());
		try (AnnotationConfigApplicationContext applicationContext =
					 new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)) {
//				SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
			System.out.println(service.returnServiceURL());
		}
	}
}
