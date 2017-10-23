package prime;

import java.util.Scanner;

public class GCDLCM {
	public static void main(String args[]) {
		// GCD and LCM of 2 numbers and then more than 2 numbers.
		
		GCDLCM obj = new GCDLCM(); 
		obj.init();
	}
	
	private void init() {
		
		GCD gcdObj = new GCD();
		LCM lcmObj = new LCM();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers to find GCD and LCM");
		
		int X=in.nextInt();
		int Y=in.nextInt();
		
		System.out.println("GCD of ("+X+","+Y+") = "+gcdObj.gcd(X, Y));
		System.out.println("LCM of ("+X+","+Y+") = "+lcmObj.lcm(X, Y));
		
		System.out.println("Now try for 3 Numbers, please input 3 numbers in increasing order to find GCD & LCM");
		
		X = in.nextInt();
		Y = in.nextInt();
		int Z = in.nextInt();
		
		// GCD of 3 numbers
		
		int GCDVal = gcdObj.gcd(gcdObj.gcd(X,Y),Z);
		
		System.out.println("GCD of ("+X+","+Y+","+Z+") = "+GCDVal);
		
		
		// For LCM of 3 or more numbers, follow below process
		
		
		int modCounter = 1;
		int multVal = 0;
		for(int i=1;i<GCDVal;i++) {
			 multVal = X*i;
			if(multVal % X==0) {
			if(multVal % Y==0)
				modCounter++;
			if(multVal % Z == 0)
				modCounter++;
			}
			if(modCounter > 3)
				break;
		}
		
		System.out.println("LCM of ("+X+","+Y+","+Z+") = "+multVal);
		
		in.close();
		
	}

}
