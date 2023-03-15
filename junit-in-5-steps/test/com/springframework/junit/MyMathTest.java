package com.springframework.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
private MyMath math = new MyMath();
	@Test
	void calculateSum_ThreeMemberArray() {
		assertEquals(6,math.calculateSum(new int[] {1,2,3}));
	}
	//test2
	@Test
	void calculateSum_ZerolengthArray() {
		assertEquals(0,math.calculateSum(new int[] {}));
	}

}
