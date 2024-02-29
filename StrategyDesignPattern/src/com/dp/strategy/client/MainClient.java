package com.dp.strategy.client;

import com.dp.strategy.context.SortingStrategyContext;
import com.dp.strategy.intrfc.impl.AsendingSortingStrategy;
import com.dp.strategy.intrfc.impl.DesendingSortingStrategy;

public class MainClient {

	public static void main(String[] args) {
		SortingStrategyContext sortingStrategyContext = new SortingStrategyContext(new AsendingSortingStrategy());
		sortingStrategyContext.performSort(new Integer[] {34,22,5,1,76,85,37,27});
		
		sortingStrategyContext = new SortingStrategyContext(new DesendingSortingStrategy());
		sortingStrategyContext.performSort(new Integer[] {34,22,5,1,76,85,37,27});
	}

}
