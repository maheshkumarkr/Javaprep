package prime;

import java.util.Scanner;

public class GCD {
	public static void main(String args[]) {
		GCD gcd = new GCD();
		gcd.init();
	}

	public void init() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers to find GCD");
		
		int X = in.nextInt();
		int Y = in.nextInt();
		
		in.close();
		
		int result = (X > Y)?gcd(X,Y):gcd(Y,X);
		
		System.out.println("GCD of ("+X+","+Y+") is = "+result);
		
	}
	public int gcd(int X,int Y) {
		if(Y==0)
			return X;
		return gcd(Y,X%Y);
	}
}
