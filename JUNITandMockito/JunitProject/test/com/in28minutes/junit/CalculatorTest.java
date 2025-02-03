package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calc = new Calculator();	
	
	@Test
	void calculateSumWithNumbers() {
		assertEquals(6, calc.calculateSum(new int[]{1,2,3}));
		//fail("Not yet implemented");
	}
	
	@Test
	void calculateSumWithEmptyArray() {
		
		assertEquals(0, calc.calculateSum(new int[]{}));
		//fail("Not yet implemented");
	}

}
