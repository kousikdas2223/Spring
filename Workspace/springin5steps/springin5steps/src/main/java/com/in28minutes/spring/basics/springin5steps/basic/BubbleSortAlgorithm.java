package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sort(int [] numbers) {
		int [] sortedNumbers = new int[] {2,3,6,5};
		return sortedNumbers;
	}

}
