package com.pratice.innerclass;

public abstract class TestAbstractClass {

	abstract void haunt(String a);
	
	abstract void haunt(String a,String b);
	
	void haunt(Integer a){
		System.out.println("A inside haunt integer method "+a);
	};
	
	
	public static void main(String[] args) {

		TestAbstractClass testAbstractClass = new TestAbstractClass() {
			
			@Override
			void haunt(String a, String b) {
				
				System.out.println("String a"+a +"string b"+ b );
				haunt(b);
			}
			
			@Override
			void haunt(String a) {
				System.out.println("   a  "+a);
				haunt(a,"v");
			}
		};
		
		testAbstractClass.haunt(100);
		testAbstractClass.haunt("Abc", "PQR");
	}

}
