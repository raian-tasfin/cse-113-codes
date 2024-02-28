// package DecisionMakingStatement;

import java.util.Scanner;

public class IfCheck {
	public static void main(String[] args) {
		Scanner SystemIn = new Scanner(System.in);

		System.out.println("Enter a number:");

		if(! SystemIn.hasNextInt()) {
			System.out.println("Error: input is not integer.");
			System.exit(-1);
		}
		int number = SystemIn.nextInt();

		if(number < 10) {
			double sqNum = number * number;
			System.out.println("SQ of Num: " + sqNum);
		}
	}
}
