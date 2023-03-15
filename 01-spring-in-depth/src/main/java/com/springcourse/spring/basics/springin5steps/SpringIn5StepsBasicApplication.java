package com.springcourse.spring.basics.springin5steps;

import com.springcourse.spring.basics.springin5steps.basic.BinarySearchImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {
//Step 1 - Setting up a Java Spring Project using htttp://start.spring.io
	//What are beans?
	//What are the dependencies of  a bean?
//	Where to search for a beans? => no need
	public static void main(String[] args) {

		//BinarySearchImp binarySearch= new BinarySearchImp(new QuickSortAlgorithm());
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		BinarySearchImp binarySearch = applicationContext.getBean(BinarySearchImp.class);
		BinarySearchImp binarySearch1 = applicationContext.getBean(BinarySearchImp.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int result=binarySearch.binarySearch(new int[]{12,4,6},3);
		System.out.println(result);
	}

}
