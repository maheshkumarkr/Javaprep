package factorial;

import java.util.Scanner;

public class FirstNonZero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstNonZero firstNonZero = new FirstNonZero();
		firstNonZero.init();
		
	}
	private void init() {
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Enter N to get last Non Zero digit value of N!");
		try {
		int N = in.nextInt();
		//in.nextLine();
		in.close();
		if(N > 20 || N <= 0)
			throw new IllegalArgumentException();
		FactorialIterative factorial = new FactorialIterative();
		long result = factorial.fact(N);
		while(true) {
			int mod = (int) (result % 10);
			result /= 10;
			if(mod != 0)
			{
				System.out.println("Last Non Zero Digit of "+ N+"! ="+mod);
				break;
			}
			else
				continue;
			
		}
		
		}
		catch(IllegalArgumentException e) {
			System.out.println(" Please enter proper positive integer for getting the result; enter number less than 21");
		}
		
	}

}
