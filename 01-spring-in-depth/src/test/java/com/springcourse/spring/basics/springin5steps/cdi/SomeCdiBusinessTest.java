package com.springcourse.spring.basics.springin5steps.cdi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.springcourse.spring.basics.springin5steps.SpringIn5StepsBasicApplication;

//Load the context
@RunWith(MockitoJUnitRunner.class)
//@ContextConfiguration("/applicationContext.xml")
//@ContextConfiguration(classes=SpringIn5StepsBasicApplication.class)
public class SomeCdiBusinessTest {

	//Get this bean from the context
	//inject mock
	@InjectMocks
	SomeCdiBusiness business;
	//create mock
	@Mock
	SomeCdiDao daoMock;
	@Test
	public void testBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
		//call method on binary search
		int actualResult = business.findGreatest();
			
		//check if the value is correct
		assertEquals(4, actualResult);
	}

}
