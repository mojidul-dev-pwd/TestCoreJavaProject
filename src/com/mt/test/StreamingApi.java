package com.mt.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

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
		
		//use of Conversion
		List<String> words = Arrays.asList("John", "Mary", "Peter", "Adam");
		Map<String, Integer> wordLengths = words.stream()
		        .collect(Collectors.toMap(
		                word -> word,
		                word -> word.length()));
		System.out.println(wordLengths);
		// if we want to collect to a set
		List<String> names = Arrays.asList("Mojidul", "Sharmin","John", "John", "John", "Mary", "Mary", "Peter", "Adam");
		Set<String> uniqueWords = names.stream()
		        .collect(Collectors.toSet());
		System.out.println(uniqueWords);
		// if we want to start and end as a list
		List<String> uniqueWords2 = names.stream()
		        .collect(Collectors.toSet()).stream().collect(Collectors.toList());
		System.out.println(uniqueWords2);
		/*
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1,"Biscuit",50.40));
		productList.add(new Product(2,"Chanachur",60.00));
		productList.add(new Product(3,"Cake",55.00));
		*/
		Product[] products = {
			    new Product(1,"Biscuit","Pineapple",50.40),
			    new Product(2,"Chanachur","BD",60.00),
			    new Product(3,"Cake","Alltime",55.00),
			    new Product(4,"Biscuit","Alltime", 40.40),
			    new Product(5,"Cake","Ideal",55.00)
			};
		
		List<String> productNames = Arrays.asList(products).stream()
		        .map(product -> product.getName())
		        .collect(Collectors.toList());

		System.out.println(productNames);
		
		//use of Reduction		
		int sum = originalList.stream()
		        .reduce(0, (a, b) -> a + b);//0 is initial value
		System.out.println("Sum = " + sum);//1-20
		
		//use of Grouping
		Map<String, List<Product>> productsByCategory = Arrays.asList(products).stream()
				.collect(Collectors.groupingBy(product -> product.getCategory()));
		System.out.println(productsByCategory);
		
		//use of Finding
		//Find the first word in a list which is longer than 5 characters.
		Optional<String> firstLongWord = names.stream()
		        .filter(word -> word.length() > 5)
		        .findFirst();//
		        //.findAny();
		System.out.println(firstLongWord);
		
		//use of Sorting
		//Sort a list of numbers in ascending order and then return the first k elements.
		List<Integer> numbers = Arrays.asList(4,2,7,2,6,3, 17,18,4,6,19,35,20);
		List<Integer> topK = numbers.stream()
		        .sorted()
		        .limit(10)//number of element you want to return
		        .collect(Collectors.toList());
		System.out.println(topK);
		
		//use of Partitioning
		//Partitioning is similar to grouping except it returns two Collections - one for elements matching the condition 
		// and one for elements not matching the condition.
		Map<Boolean, List<Product>> productByCategory = Arrays.asList(products)
		        .stream()
		        .collect(Collectors.partitioningBy(s -> s.getCategory() == "Biscuit"));
		System.out.println(productByCategory);
		
		//use of Counting
		long count = words.stream()
		        .filter(word -> word.length() > 4)
		        .count();
		System.out.println("Count = " +count);
		
		//use of Range
		int[] nos = IntStream.range(1, 11).toArray();
		//convert int[] to list
		List<Integer> list = Arrays.stream(nos).boxed().collect(Collectors.toList());
		
		List topK2 = list.stream()
		        .sorted()
		        .limit(10)//number of element you want to return
		        .collect(Collectors.toList());
		System.out.println(topK2);
		
		//use of Matching
		// true when all elements match the predicate
		boolean allMatch = Arrays.asList(products).stream()
		        .allMatch(product -> product.getPrice() > 40);
		System.out.println(allMatch);

		// true when any element matches the predicate
		boolean anyMatch = Arrays.asList(products).stream()
		        .anyMatch(product -> product.getPrice() > 80);
		System.out.println(anyMatch);

		// true when no elements match the predicate
		boolean noneMatch = Arrays.asList(products).stream()
		        .noneMatch(product -> product.getPrice() > 90);
		System.out.println(noneMatch);
		
		//use of Joining
		String joinedWords = words.stream()
		        .collect(Collectors.joining(" "));
		System.out.println(joinedWords);
	}
}


class Product{
	private int id;
	private String category;
	private String name;
	private double price;
	
	public Product(int id, String category, String name, double price) {
		this.id = id;
		this.category = category;
		this.name = name;
		this.price = price;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
}
