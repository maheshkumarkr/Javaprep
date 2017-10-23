package prime;

import java.util.Scanner;

public class LCM {
	public static void main(String args[]) {
		LCM lcm = new LCM();
		lcm.init();
	}

	public void init() {
		// LCM using GCD
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers to find GCD");
		
		int X = in.nextInt();
		int Y = in.nextInt();
		
		System.out.println("LCM of ("+X+","+Y+") = "+lcm(X,Y));
		
		in.close();
		
	}
	public int lcm(int X,int Y) {
		GCD gcdObj = new GCD();
		int GCDVal = gcdObj.gcd(X, Y);
		
		return (X*Y)/GCDVal;
	}
	
}
