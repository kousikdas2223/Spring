package com.in28minutes.mockito.mockito_demo.business;

public class SomeBusinessImpl {
	
	private DataService dataService;
	
	public int findMaxFromAllData() {
		int[] data = dataService.retrieveAllData();
		int max = Integer.MIN_VALUE;
		for(int x: data) {
			if(x>max)
				max = x;
		}
		return max;
	}

	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

}

interface DataService{
	int [] retrieveAllData();
}
