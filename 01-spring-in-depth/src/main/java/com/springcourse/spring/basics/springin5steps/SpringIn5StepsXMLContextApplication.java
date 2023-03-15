package com.springcourse.spring.basics.springin5steps;

import com.springcourse.spring.basics.springin5steps.basic.BinarySearchImp;
import com.springcourse.spring.basics.springin5steps.xml.XmlPersonDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringIn5StepsXMLContextApplication {
//Step 1 - Setting up a Java Spring Project using htttp://start.spring.io
	//What are beans?
	//What are the dependencies of  a bean?
//	Where to search for a beans? => no need
	public static void main(String[] args) {

		//BinarySearchImp binarySearch= new BinarySearchImp(new QuickSortAlgorithm());
		try (ClassPathXmlApplicationContext applicationContext =
					 new ClassPathXmlApplicationContext("applicationContext.xml")) {
//				SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(personDao);
			System.out.println(personDao.getXmlJdbcConnection());
		}
	}
}
