package com.dp.strategy.intrfc.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.dp.strategy.intrfc.SortingStrategy;

public class AsendingSortingStrategy implements SortingStrategy {
	
	@Override
	public void sort(Integer[] array) {
		List<Integer> aList = Arrays.asList(array);
		aList.stream()
		 .sorted().collect(Collectors.toList())
		 .forEach(sortItem -> System.out.print(sortItem+","));
		System.out.println("");
	}

}
