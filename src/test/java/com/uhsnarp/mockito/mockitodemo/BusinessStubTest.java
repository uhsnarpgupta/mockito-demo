package com.uhsnarp.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BusinessStubTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		BusinessImpl businessImpl = new BusinessImpl(new DataServiceStub());
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 24, 16, 15 };
	}

}
