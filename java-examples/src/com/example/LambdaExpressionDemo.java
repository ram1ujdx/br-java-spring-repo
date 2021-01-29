package com.example;

interface Operation{
	double operate(double a, double b);
}

class Calculator{
	public double calculate(double a, double b, Operation op) {
		return op.operate(a, b);
	}
}

public class LambdaExpressionDemo {

	public static void main(String[] args) {
	
		Calculator c1=new Calculator();
		
		double result=c1.calculate(5, 6, (a,b)->{
												return a-b;
												});
		System.out.println(result);
		

	}

}
