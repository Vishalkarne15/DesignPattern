package com.dp.strategy.context;

import com.dp.strategy.intrfc.SortingStrategy;

public class SortingStrategyContext {
	private SortingStrategy sortingStrategy;
	
	public SortingStrategyContext(SortingStrategy sortingStrategy) {
		this.sortingStrategy = sortingStrategy;
	}

	public void setSortingStrategy(SortingStrategy sortingStrategy) {
		this.sortingStrategy = sortingStrategy;
	}
	
	public void performSort(Integer[] array) {
		sortingStrategy.sort(array);
	}
}
