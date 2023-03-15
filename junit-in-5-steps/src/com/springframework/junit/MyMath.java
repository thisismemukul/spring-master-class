package com.springframework.junit;

public class MyMath {

	public int calculateSum(int[] numbers) {
		//test
		int sum =0;
		for(int number:numbers) {
			sum+=number;
		}
		return sum;
	}
}
