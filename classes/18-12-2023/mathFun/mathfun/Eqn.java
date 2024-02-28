package mathfun;

import java.lang.Math;

class Eqn
{
	static double solver(double t, double x) {
		System.out.println("Double input.");
		if(t < 0) {
			return -1;
		}
		if(Math.sqrt(t) + x == 0) {
			return -1;
		}
		double mSquared = 6*t*t/(Math.sqrt(t)+x);
		if(mSquared < 0) {
			return -1;
		}
		return Math.sqrt(mSquared);
	}
	static double solver(int t, int x) {
		System.out.println("Int input.");
		if(t < 0) {
			return -1;
		}
		if(Math.sqrt(t) + x == 0) {
			return -1;
		}
		double mSquared = 6*t*t/(Math.sqrt(t)+x);
		if(mSquared < 0) {
			return -1;
		}
		return Math.sqrt(mSquared);
	}

	public static void main(String args[]) {
		int xInt;
		int tInt;
		double res;

		// invalid input
		xInt = -2;
		tInt = 4;
		res = solver(tInt, xInt);
		System.out.println(res);

		// Invalid double input
		res = solver((double)tInt, (double)xInt);
		System.out.println(res);

		// valid int input
		xInt = 12;
		tInt = 36;
		res = solver(tInt, xInt);
		System.out.println(res);

		// valid double input
		res = solver((double)tInt, (double)xInt);
		System.out.println(res);
	}
}
