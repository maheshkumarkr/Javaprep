package prime;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Prime {

	/**
	 * @param args
	 */
	
	Map<Integer,Boolean> isValPrime = new HashMap<>();
	List<Integer> primeNos = new ArrayList<>();
	//Map<Integer,Integer> primeFactors = new HashMap<>(); // to store smallest prime factor of number
	
	int MAX_SIZE = 100001; // Some big number
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result;
		Scanner in = new Scanner(System.in);
		System.out.println(" Enter a positive integer to check if it is Prime or Not");
		
		int N = in.nextInt();
		Prime checkPrime = new Prime();
		result = checkPrime.isPrime(N);
		
		System.out.println(result);
		
		System.out.println(" Enter a positive integer X,Y to print all Prime Numbers between X and Y");
		
		int X = in.nextInt();
		int Y = in.nextInt();
		result = checkPrime.printPrimeInRange(X,Y);
		
		in.close();
		System.out.println(result);
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
	
	public String printPrimeInRange(int X,int Y){
		
		/*
		 * 
		 * First Check for number X,Y are Co-Prime 
		 * if X,Y are not Co-prime, Loop from X to Y - use previous logic of checking for Prime Numbers to determine List of Primer Numbers inbetween X and Y 
		 *  
		 * 
		 * 
		 * 
		 *   
		 * 
		 */
		
		GCD gcd = new GCD();
		
		if(gcd.gcd(X, Y)!=1) {
		
		//init(X,Y);
		
		for(int i=X;i<=Y;i++){
			if("YES".equals(isPrime(i)))
				primeNos.add(i);
		}
		return primeNos.toString();
		}
		else {
			return "Numbers are Co-Prime";
		}
		
		
	}

	public String printFirstLastPrime(String range){
		
		return null;
	}
	
}

