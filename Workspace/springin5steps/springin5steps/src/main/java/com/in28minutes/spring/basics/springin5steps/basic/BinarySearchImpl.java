package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm quickSortAlgorithm;
	
	public int binarySearch(int [] numbers) {
		
		int [] sortedNumbers = quickSortAlgorithm.sort(numbers);
		
		return sortedNumbers[2];
	}

}
