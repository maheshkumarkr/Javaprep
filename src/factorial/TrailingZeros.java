package factorial;

import java.util.Scanner;

public class TrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrailingZeros trailZeros = new TrailingZeros();
		trailZeros.init();
		
	}
	private void init() {
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Enter N to trailing zeros in N!");
		try {
		int N = in.nextInt();
		in.nextLine();
		//in.close();
		if(N > 20 || N <= 0)
			throw new IllegalArgumentException();
		FactorialIterative factorial = new FactorialIterative();
		long result = factorial.fact(N);
		int zeroCounter = 0;
		while(true) {
			int mod = (int) (result % 10);
			if(mod == 0)
				zeroCounter++;
			else
				break;
			result /= 10;
		}
		System.out.println("Trailing zeros for "+ N+"! ="+zeroCounter);
		}
		catch(IllegalArgumentException e) {
			System.out.println(" Please enter proper positive integer for getting the result; enter number less than 21");
		}
		
		
		// Better Approach without calculating Factorial
		
		System.out.println("Now for a better approach without calculating Factorial, please enter a positive integer number");
		try {
		in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		if(N <= 0)
			throw new IllegalArgumentException();
		
		/*
		 * Approach is to get all pairs of 2,5 less than N, as pairs of 2 and 5 are the ones that make up 0s
		 * 
		 */
		
		
		if(N < 5)
			System.out.println("Trailing zeros for "+ N+"! ="+0);
		else {
		long tmp = 5;
		long zeroCount = 0;
		
		while(tmp < N) {
			zeroCount += (N/tmp);
			tmp*=5;
		}
		System.out.println("Trailing zeros for "+ N+"! ="+zeroCount);
		}
		}
		catch(IllegalArgumentException e) {
			System.out.println(" Please enter proper positive integer for getting the result");
		}
		
		
		
	}

}
