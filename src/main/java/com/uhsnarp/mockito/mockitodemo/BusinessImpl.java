package com.uhsnarp.mockito.mockitodemo;

public class BusinessImpl {
	private DataService dataService;

	public BusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		for (int value : data) {
			greatest = value > greatest ? value : greatest;
		}
		return greatest;
	}
}
