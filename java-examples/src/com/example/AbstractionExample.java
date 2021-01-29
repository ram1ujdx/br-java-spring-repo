package com.example;

import java.io.IOException;

abstract class Abstract{
	abstract void show();
	
	 void someMethod() {
		System.out.println("Some Method");
	}
}

class MyClass extends Abstract{
	@Override
	void show() throws ArithmeticException  {
		System.out.println("Overridden");
		
	}
}

public class AbstractionExample {

	public static void main(String[] args) {
		
		Abstract obj=new MyClass();
		obj.someMethod();
		obj.show();

	}

}
