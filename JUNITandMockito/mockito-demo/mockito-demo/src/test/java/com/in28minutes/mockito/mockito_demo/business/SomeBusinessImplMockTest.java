package com.in28minutes.mockito.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {
	
	@Mock
	private DataService dataServiceMock;	
	
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;

	@Test
	void findTheMaxFromAllData_Mock() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5,7,80});
		assertEquals(80, someBusinessImpl.findMaxFromAllData());
		
	}
	
	@Test
	void findTheMaxFromAllData_Mock_With4Value() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {20,5,7,80});
		assertEquals(80, someBusinessImpl.findMaxFromAllData());
		
	}

}
