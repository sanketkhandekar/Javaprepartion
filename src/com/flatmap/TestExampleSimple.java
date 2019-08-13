package com.flatmap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestExampleSimple {

	public static void main(String args[]) {

		testDemo();
		testDemo2();
		testDemo3();
	}

	/**
	 * 
	 */
	private static void testDemo3() {
		int[] intArray = { 1, 2, 3, 4, 5, 6 };

		// 1. Stream<int[]>
		Stream<int[]> streamArray = Stream.of(intArray);

		// 2. Stream<int[]> -> flatMap -> IntStream
		IntStream intStream = streamArray.flatMapToInt(x -> Arrays.stream(x));

		intStream.forEach(x -> System.out.println(x));
	}

	/**
	 * 
	 */
	private static void testDemo2() {
		String[][] data = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		// Stream<String[]>
		Stream<String[]> temp = Arrays.stream(data);

		// Stream<String>, GOOD!
		Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

		Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));

		stream.forEach(System.out::println);
	}

	/**
	 * 
	 */
	private static void testDemo() {
		System.out.println("ABC");

		String[][] data = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		// Stream<String[]>
		Stream<String[]> temp = Arrays.stream(data);

		// filter a stream of string[], and return a string[]?
		Stream<String[]> stream = temp.filter(x -> "a".equals(x.toString()));

		stream.forEach(System.out::println);
	}

}
