package com.example;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Hello Everyone");
		System.out.println("Trying to Divide");
		
		try {
		int x=divide(5, 0);
		}
		catch (NegativeNumberException e) {
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			System.err.println("Cannot Divide By Zero");
		}
		System.out.println("Execution Completed");

	}
	
	
	static int divide(int a, int b){
		if(b==0) {
			throw new NegativeNumberException("NegativeNumberExcepion for input : "+b);
		}
		return a/b;
	}

}

// throws and throw