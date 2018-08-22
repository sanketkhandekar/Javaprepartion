package com.pratice.generic;

public class GenericClass<T> {

	private T t;

	public GenericClass() {
	}

	public GenericClass(T t) {

		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		GenericClass<String> type = new GenericClass<String>();
		type.setT("ABC");

		System.out.println(" Generic " + type.getT());

		GenericClass type2 = new GenericClass<>();

		type2.setT(100);
		System.out.println(" type2 " + type2.getT());
	}

}
