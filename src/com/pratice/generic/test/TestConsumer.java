package com.pratice.generic.test;

import com.pratice.generic.Consumer;

public class TestConsumer {

	public static void main(String[] args) {
		Consumer<String> consumeS = new Consumer<>("This is test");
		System.out.println(consumeS.getConsumer());
		Consumer<Integer> consumeI = new Consumer<>(1234);
		System.out.println(consumeI.getConsumer());
		consumeS.add("Java ");
		consumeS.add("Spring ");
		System.out.println(consumeS.getList());
	}
	
	

}
