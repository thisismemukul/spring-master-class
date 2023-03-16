package com.springframework.mokito.mokitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		DataServiceStub dataServiceStub = new DataServiceStub();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retriveAllData() {
		// TODO Auto-generated method stub
		return new int[] {25,15,5};
	}
	
}
//problem is if we want to pass multiple test cases => we need to make multiple implements (or duplicate) thus that's not a good practice