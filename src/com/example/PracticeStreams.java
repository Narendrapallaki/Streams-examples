package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class PracticeStreams {

	public static void main(String[] args) {

		List<String> duplecates = Arrays.asList("apple", "bananna", "cara", "apple");
		List<Integer> asList = Arrays.asList(22, 3, -1, 0, 22,3);

//		int totalSum = asList.stream().mapToInt(sum -> sum + sum).sum();
//		System.out.println("Sum of numbers is : " + totalSum);

		// average of numbers
//		 double average = asList.stream().mapToInt(avg -> avg).average().getAsDouble();
//		 System.out.println("Average of numbers : "+average);

		// 4+9=13 avg=6.5 Average of squares
//		double avgOfSquares = asList.stream().mapToInt(mul -> mul*mul).average().getAsDouble();
//		System.out.println("Average of squares :"+ avgOfSquares);

		// even and odd number
//		asList.stream().filter(even -> even%2==0)
//		.forEach(System.out::print);
		// asList.stream().filter(odd -> odd%2!=0).forEach(System.out::print);

		// fetch start with n number
//		asList.stream().filter( a-> String.valueOf(a).startsWith("2"))
//		  .mapToInt(Integer::intValue).forEach(System.out::print);

		// remove duplecats from the list of numbers
		// asList.stream().map( a-> a).distinct().forEach(System.out::println);

		// or fetch repeted numbers
		//Set<Integer> collect = asList.stream().filter(a-> Collections.frequency(asList, a)>1).collect(Collectors.toSet());
		//System.out.println("Duplecates : "+ collect);

		// remove duplecates in each word
		// duplecates.stream().flatMap( word -> word.chars().mapToObj(c->(char)
		 //c)).distinct() .forEach(System.out::print);

		// remove duplecat words from a list
		// duplecates.stream().distinct().forEach(System.out::println);

		// reverse the word
		// duplecates.stream().map(a-> new
		// StringBuffer(a).reverse()).forEach(System.out::println);

		// duplecates.stream().filter(a->
		// a.toLowerCase().startsWith("a")).forEach(System.out::println);

		// max and min from a list
//		int maxValue = asList.stream().mapToInt(a->a).max().getAsInt();
//		int minvalue = asList.stream().mapToInt(b->b).min().getAsInt();
//		System.out.println("Max value : "+maxValue +" Min value : "+minvalue);
		// or
//		Integer integer = asList.stream().max(Comparator.comparing(Integer::valueOf)).get();
//		System.out.println("Max value :"+integer);

		// duplecates.stream().map(a->a.length()).forEach(System.out::println);

//		Frequency Count
//		Given a list of strings, count the frequency of each unique string in the list

      /*  Map<String, Long> frequencyMap = duplecates.stream()
            .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

		Map<String, Long> map = new HashMap<>();

		for (String s : duplecates) {
			
			if (!map.containsKey(s)) {

				map.put(s, (long) 1);

			} else {
				map.put(s, map.get(s) + 1);
			}
		}
		for (Map.Entry<String, Long> m : map.entrySet()) {

			System.out.println(" key :" + m.getKey() + " " + "values " + m.getValue());
		}
*/
		
		//asList.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).forEach(System.out::println);
		
		//sum of first two numbers
//		int sum = asList.stream().limit(2).mapToInt(a->a).sum();
//		System.out.println(sum);
		
		
	//	Map<String,Long> collect = duplecates.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
		//collect.forEach((key,value)-> System.out.println(key +" "+value));
		
		//collect.entrySet().stream().filter( a-> a.getValue()>1)
		//.forEach(System.out::println);
		
		
	}

}
