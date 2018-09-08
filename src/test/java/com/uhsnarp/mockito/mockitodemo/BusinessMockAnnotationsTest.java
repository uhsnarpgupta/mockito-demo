package com.uhsnarp.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BusinessMockAnnotationsTest {
	@Mock
	DataService dataServiceMock;

	@InjectMocks
	BusinessImpl businessImpl;

	@Test
	public void testFindTheGreatestFromAllData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 16, 15 });
		assertEquals(24, businessImpl.findTheGreatestFromAllData());
	}

	@Test
	public void testFindTheGreatestFromAllData_forOneValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24 });
		assertEquals(24, businessImpl.findTheGreatestFromAllData());
	}

	@Test
	public void testFindTheGreatestFromAllData_NoValues() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
	}

}
