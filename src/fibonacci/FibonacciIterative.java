package fibonacci;

import java.util.Scanner;

public class FibonacciIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FibonacciIterative fib = new FibonacciIterative();
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
		
		System.out.println("Fibonacci Number for "+N+" = "+fibonacciIterative(N));
		}
		catch(IllegalArgumentException e) {
			System.out.println("Please enter positive integer");
		}
	}
	
	public long fibonacciIterative(int n) {
	if(n <= 1) {
		return n;
	}
	int fib = 1;
	int prevFib = 1;
	
	for(int i=2; i<n; i++) {
		int temp = fib;
		fib+= prevFib;
		prevFib = temp;
	}
	return fib;
	}
}
