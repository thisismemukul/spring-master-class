package com.springframework.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	List<String> todos = Arrays.asList("AWS", "Azure", "DevOPS");

	@Test
	void test() {
		boolean test = todos.contains("AWS");
//		assertEquals(true, test);
		assertTrue("Something went wrong",test);
		assertEquals(3,todos.size(),"Error Message");
	}

}
