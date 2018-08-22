package com.pratice.innerclass;

public class JavaPraticeInnerClass {

	public static Integer somevalue = 100;

	static class TestInnerStatic {

		static int value = 100;

		int no = 300;

		public void testInnerMethod(Integer value, Integer sec) {

		}

		public void testInnerMethod(Double value, Integer sec) {
		}

		public void testInnerMethod(Float value, Integer sec) {
		}

		public void testInnerMethod(Integer sec) {
		}

		public TestInnerStatic testInnerMethod(Integer value, Float sec) {
			somevalue = value;
		System.out.println("   no "+no);
			this.no = somevalue;
			TestInnerStatic.value = this.no;
			System.out.println("someValue "+somevalue);
		
			return this;
		}

		@Override
		public String toString() {
			return "TestInnerStatic [no=" + no + "]"+" Value = "+value;
		}
		
		
	}

	public static void main(String[] args) {
		JavaPraticeInnerClass jp = new JavaPraticeInnerClass();
		JavaPraticeInnerClass.TestInnerStatic javaPraticeInnerClass = new JavaPraticeInnerClass.TestInnerStatic();
		System.out.println("javaPraticeInnerClass   1  "+javaPraticeInnerClass);
		javaPraticeInnerClass.no = 100;
		System.out.println("javaPraticeInnerClass   2  "+javaPraticeInnerClass);
		javaPraticeInnerClass.value = 200;
		System.out.println("javaPraticeInnerClass   3  "+javaPraticeInnerClass);
		TestInnerStatic.value = 300;
		System.out.println("javaPraticeInnerClass   4  "+javaPraticeInnerClass);
		jp.somevalue = 132;
		System.out.println("javaPraticeInnerClass   5  "+javaPraticeInnerClass);
		System.out.println(javaPraticeInnerClass.testInnerMethod(770,0F));
		System.out.println("javaPraticeInnerClass   61  "+javaPraticeInnerClass);

	}

}
