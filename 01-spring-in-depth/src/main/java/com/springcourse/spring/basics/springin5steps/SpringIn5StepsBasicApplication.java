package com.springcourse.spring.basics.springin5steps;

import com.springcourse.spring.basics.springin5steps.basic.BinarySearchImp;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springcourse.spring.basics.springin5steps")
public class SpringIn5StepsBasicApplication {
//Step 1 - Setting up a Java Spring Project using htttp://start.spring.io
	//What are beans?
	//What are the dependencies of  a bean?
//	Where to search for a beans? => no need
	public static void main(String[] args) {

		//BinarySearchImp binarySearch= new BinarySearchImp(new QuickSortAlgorithm());
		try (AnnotationConfigApplicationContext applicationContext =
					 new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)) {
//				SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
			BinarySearchImp binarySearch = applicationContext.getBean(BinarySearchImp.class);
			BinarySearchImp binarySearch1 = applicationContext.getBean(BinarySearchImp.class);
			System.out.println(binarySearch);
			System.out.println(binarySearch1);
			int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
			System.out.println(result);
		}
	}
}
