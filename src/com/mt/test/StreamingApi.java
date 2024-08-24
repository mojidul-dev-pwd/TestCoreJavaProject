package com.mt.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamingApi {

	public static void main(String[] args) {

		//use of filter
		List<Integer> originalList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		List<Integer> evenNumbers = originalList.stream()
		        .filter(n -> n % 2 == 0)
		        .collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		//use of processing
		List<Integer> squares = originalList.stream()
		        .map(n -> n * n)
		        .collect(Collectors.toList());
		System.out.println(squares);
		
		//List<String> names = Arrays.asList("John", "Mary", "Peter", "Adam");


	}

}
