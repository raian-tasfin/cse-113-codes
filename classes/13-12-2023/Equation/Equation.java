import java.lang.Math;
import java.util.Scanner;

class Equation
{

	public static void main(String args[]) {
		Scanner std = new Scanner(System.in);

		System.out.print("Enter a non-negative value for t: ");
		double t = std.nextDouble();
		System.out.print("Enter a value for x: ");
		double x = std.nextDouble();

		if(t < 0) {
			System.out.println("t cannot be negative. Abort.");
			return;
		}

		double sqrtT = Math.sqrt(t);
		if(t + x == 0) {
			System.out.println("sqrt(t) + x cannot be 0. Abort.");
			return;
		}

		double mSquare = (6*t*t) / (sqrtT + x);
		if(mSquare < 0) {
			System.out.println("Cannot calculate square root of negative number.");
			return;
		}
		double m = Math.sqrt(mSquare);
		// System.out.println("m = " + m);
		System.out.printf("%1.6f\n", m);
	}
}
