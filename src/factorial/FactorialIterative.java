package factorial;

import java.util.Scanner;

public class FactorialIterative {
	public static void main(String args[]) {
		FactorialIterative factorial = new FactorialIterative();
		
		factorial.init();
		
	}
	
	private void init() {
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Enter N to get Factorial");
		try {
		int N = in.nextInt();
		in.close();
		if(N > 20 || N <= 0)
			throw new IllegalArgumentException();
		long result = fact(N);
		
		System.out.println(" Factorial of "+ N +" = "+result);
		
		}
		catch(IllegalArgumentException e) {
			System.out.println(" Please enter proper positive integer for getting Factorial; enter number less than 21");
		}
		
	}

	public long fact(int N) {
		
		long result = 1;
		
		while(N >= 1) {
			result *= N;
			N--;
		}
		
		return result;
	}
	
}
