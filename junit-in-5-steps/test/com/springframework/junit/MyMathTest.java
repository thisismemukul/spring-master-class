package com.springframework.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void test() {
		int[] numbers= {1,2,3};
		MyMath math = new MyMath();
		int result = math.calculateSum(numbers);
		System.out.println(result);
		int expectedResult = 6;
		assertEquals(expectedResult,result);
		//absence  of failure is success
		//test condition or assert
//		fail("Not yet implemented");
	}

}
