package fibonacci;

import java.util.Scanner;

import factorial.FactorialIterative;

public class FibonacciRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FibonacciRecursive fib = new FibonacciRecursive();
		fib.init();
		
	}
	
	private void init() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter N for getting Nth number in Fibonacci Series");
		try {
		int N = in.nextInt();
		in.close();
		if(N <= 0)
			throw new IllegalArgumentException();
		//FactorialIterative factorial = new FactorialIterative();
		
		System.out.println("Fibonacci Number for "+N+" = "+fibonacciRecursive(N));
		}
		catch(IllegalArgumentException e) {
			System.out.println("Please enter positive integer value");
		}
		
	}
	
	public long fibonacciRecursive(int n) {
		if(n <= 1) {
			return n;
		}
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}

}
