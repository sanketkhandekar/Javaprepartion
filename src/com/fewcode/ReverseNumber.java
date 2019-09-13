package com.fewcode;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseNumber {

	public static void main(String[] args) {
		reverseNumberWhileLoop(123);
		reverseNumberForLoop(123);
		Integer i = 123;
		reverseNumberForLoop(i);
		reverseNumberUsingStream(i);

	}

	private static void reverseNumberWhileLoop(int i) {
		int reverseNumber = 0;
		while (i != 0) {
			int no = i % 10;
			reverseNumber = reverseNumber * 10 + no;
			i = i / 10;
		}
		System.out.println("reverse No " + reverseNumber);

	}

	private static void reverseNumberForLoop(int i) {
		int reverseNumber = 0;

		for (; i != 0;) {
			int no = i % 10;
			reverseNumber = reverseNumber * 10 + no;
			i = i / 10;

		}
		System.out.println("reverse No " + reverseNumber);

	}

	private static void reverseNumberForLoop(Integer i) {
		int reverseNumber = 0;

		for (; i != 0;) {
			int no = i % 10;
			reverseNumber = reverseNumber * 10 + no;
			i = i / 10;

		}
		System.out.println("reverse No integer " + reverseNumber);

	}

	private static void reverseNumberUsingStream(Integer i) {
		String str= Stream.of(i).
				map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println("reveese no "+str);
	}

}
