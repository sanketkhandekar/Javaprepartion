package com.java.java8.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String args[]) {

		// print the no from 1 to 10
		IntStream
				.range(1, 10)
				.forEach(System.out::println);

		System.out.println("  \n ");
		//2 Integer stream with skip

		System.out.println("2 Integer stream with skip ");		
		IntStream
				.range(1, 10)
				.skip(5)
				.forEach(x -> System.out.println(x));
		

		System.out.println("  \n ");

		//3 Integer Stream with Sum
		
		System.out.println("//3 Integer Stream with Sum");
	
		Integer sum = IntStream
			.range(8, 11)
			.sum();
		System.out.println(sum);
		
		System.out.println("  \n ");

		
		//4 Stream of Sorted and find first
		System.out.println("//4 Stream of Sorted and find first");
		Stream
			.of("Sanket","Anil","Ramesh")
			.sorted()
			.findFirst()
			.ifPresent(x -> System.out.println(x));

		//4 Stream of Sorted and find first
		System.out.println("//4 Stream of Sorted and find first");
		Stream
			.of("Sanket","Anil","Ramesh")
			.sorted()
			.findFirst()
			.ifPresent(x -> System.out.println(x));
	
		//5 Stream of ArrayList and check with start with S;
		System.out.println("5 Stream of ArrayList and check with start with A Sorted and reverse sort");
		
		String names[] = {"Sanket","Anushree","Suni","Amol","Anita","Akshay"};
		Comparator<? super String> comparator = (p1, p2) -> p2.compareTo(p1);
		Arrays
			.stream(names)
			.filter(x -> x.startsWith("A"))
			.sorted(comparator)
			.forEach(s -> System.out.println(s));
		
		// 6 Avg of squares of an int array
		
		System.out.println(" 6 Avg of squares of an int array");
		Arrays
				.stream(new int[] { 2, 4, 6})
				.map(x -> x * x)
				.peek(System.out::println)
				.average()
				.ifPresent(s -> System.out.println(s));	
		
		//7 Stream from list , filter and print 
		
		List<String> list = Arrays.asList("Sanket","Amol","Suzen","Shamala","Tiger","Mehul","Ram","Stev","Santosh");
		
		System.out.println(" 7 Stream from list , filter and print");
		 list
			.stream()
			.map(String::toLowerCase)
			.filter(name -> name.startsWith("s"))
			.forEach(System.out::println);
		
	//7.1 Stream from list , filter and print and create another list 
		
		System.out.println(" 7.1 Stream from list , filter and print");
		List<String> collect = list
			.stream()
			.map(String::toLowerCase)
			.filter(name -> name.startsWith("s"))
			.collect(Collectors.toList());
		
		List<String> finalList= collect;
		finalList
			.forEach(System.out::println);
		
		// 8 Read the file sort filter and print
		System.out.println(" 8 Read the file sort filter and print");
		try {
			Stream<String> cricketerNames = Files.lines(Paths.get(".\\file\\cricketerNames.txt"));
			cricketerNames
				.sorted()
				.filter(x -> x.length() > 14)
				.forEach(x -> System.out.println(x));
			cricketerNames.close();
		} catch (IOException e) {
		}
		System.out.println(" 9 Read the file sort filter and collect fileter");
		//9 Read the file sort filter and collect fileter
		try {
			Stream<String> cricketerNames = Files.lines(Paths.get(".\\file\\cricketerNames.txt"));
			List<String> filetersCricketers = cricketerNames
				.map(String::toLowerCase)
				.filter(x -> x.contains("ten"))
				.collect(Collectors.toList());
			filetersCricketers
				.forEach(x -> System.out.println(x));
			cricketerNames.close();
		} catch (IOException e) {
		}
		// 10 Csv data read split filter and display
		System.out.println(" 10 Csv data read split filter and display");
		try
		{
			Stream<String> datas = Files.lines(Paths.get(".\\file\\stockData.txt"));
			
			long count = datas
			.map(x -> x.split(","))
			.filter(x->x.length ==3)
			.count();

			datas.close();
			System.out.println("count "+count);
		} catch (IOException e) {
		}	
		
	// 11 Csv data read split filter,filter,display
			System.out.println(" 11 Csv data read split filter and display");
		try
		{
			Stream<String> datas = Files.lines(Paths.get(".\\file\\stockData.txt"));
			
			datas
			.map(x -> x.split(","))
			.filter(x->x.length ==3)
			.filter(x-> Integer.parseInt(x[1]) > 300)
			.forEach(x ->  System.out.println(x[0] + "  "+ x[1]+"  "+x[2]));
			datas.close();
		} catch (IOException e) {
		}	
			
		// 12 Csv data read split filter,filter,Add to the map
			System.out.println(" 12 Csv data read split filter,filter,Add to the map");
		try
		{
			Stream<String> datas = Files.lines(Paths.get(".\\file\\stockData.txt"));
			
			Map<String, String> map = datas
			.map(x -> x.split(","))
			.filter(x->x.length ==3)
			.filter(x-> Integer.parseInt(x[1]) > 300)
			.collect(Collectors.toMap(x->x[0],x->x[1]));
			
			for(String key:map.keySet()) {
				
				System.out.println("map "+"key "+key +" value "+map.get(key));
			}
			datas.close();
		} catch (IOException e) {
		}		
		
		System.out.println("13 Addition of Double using reduce ");
		// 13 Addition of Double using reduce 
		double total =Stream.of(7.3,1.5,4.5)
				.reduce(0.0, (Double a, Double b) -> a+b);
		System.out.println("total "+total);	
		
		System.out.println("14 Reduction Summary Statistics");

		//14  Summary Statistics
		IntSummaryStatistics summary = IntStream.of(14,12,1,5,212,12)
				.summaryStatistics();
		System.out.println("summary "+summary);
		
	}

}
