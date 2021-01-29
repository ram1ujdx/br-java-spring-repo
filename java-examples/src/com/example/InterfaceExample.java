package com.example;


interface MyInterface{
	void show();
	default void test() {
		
	}
}

//class MyClass1 implements MyInterface{
//	@Override
//	public void show() {
//		System.out.println("Hello World");
//		
//	}
//}

public class InterfaceExample {

	public static void main(String[] args) {
		
		MyInterface intr=()-> System.out.println("Hello World");
			
		
		intr.show();

	}

}
