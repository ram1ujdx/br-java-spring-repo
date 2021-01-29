package com.example;

class MethodOverloadingExample{
	int add(int a, int b) {
		return a+b;
	}
	
	float add(float a, float b ) {
		return a+b;
	}
}

class A{
	public void show() {
		System.out.println("Show From A");
	}
}

class B extends A{
	@Override
	public void show() {
		System.out.println("Show From B");
	}
}



public class App {

	public static void main(String[] args) {
		
		A obj=new B();
		obj.show();

	}

}
