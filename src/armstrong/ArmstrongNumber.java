package armstrong;

import java.util.Scanner;

public class ArmstrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArmstrongNumber arms = new ArmstrongNumber();
		arms.init();
	}

	private void init() {
		Scanner in = new Scanner(System.in);
		System.out
				.println("Input a number to check if it is an Armstrong number");
		int n = in.nextInt();
		in.close();
		System.out.println(isArmStrongNumer(n));

	}
	public String isArmStrongNumer(int n){
		int sum = 0;
		int temp = n;

		int digits = 0;
		// Count number of digits

		while (temp != 0) {
			digits++;
			temp = temp / 10;
		}

		temp = n;

		while (temp != 0) {
			int remainder = temp % 10;
			// Calculate power of remainder
			int powSum = 1;
			for (int i = 1; i <= digits; i++) {
				powSum *= remainder;
			}
			sum = sum + powSum;

			temp = temp / 10;
		}

		if (n == sum)
			return(n + " is an Armstrong number.");
		else
			return(n + " is not an Armstrong number.");
	}
	
}
