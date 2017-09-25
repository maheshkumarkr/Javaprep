package com.progs;

public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	public String isPrime(int N){
		
		// Prime Number - is defined as a number that is divisible only by itself and 1
		
		// As per definition we can check if a number is Prime or Not by 
		// a) running a loop from 1 to N/2 and see if any number between 1 and N/2 divides N - O(N/2) - for actual Prime Numbers/worst case
		// b) Basic mathematics states that you need not check till N - rather check till Sqrt(N) which will be enough to determine factor(s) of a number
		// 		(i) in Java perspective instead of using MATH.sqrt library - we can employ perfect square principle - sqrt(N=n*n) = n -> instead of SQRT(N) we can check n*n
		// For any
		if(N < 2){
			return "Please enter a valid number";
		}
		else{
		for(int i=2;i*i<=N;i++){
			if(N%i==0)
				return "NO";
		}
		}
		return "YES";
	}

}
