package com.pratice.generic;

import java.util.ArrayList;
import java.util.List;

public class Consumer<T> {

	private List<T> list;

	private T t;

	public Consumer(T t) {

		this.t = t;
		add(t);
	}

	public T getConsumer() {

		return t;
	}

	public void add(T t) {

		if (list == null) {

			list = new ArrayList<>();
		}
		list.add(t);
	}

	public List<T> getList() {

		return list;
	}

}
