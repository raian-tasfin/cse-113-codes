class TestDemo {
	void test() {
		System.out.println("No parameters");
	}
	void test(int a) {
		System.out.println("a = " + a);
	}
	void test(int a, double b) {
		System.out.println("a = " + a + " b = " + b);
	}

	void type(float a) {
		System.out.println("float");
	}
	void type(double b) {
		System.out.println("double");
	}
}

public class TestFinal {
	public static void main(String args[]) {
		TestDemo my1 = new TestDemo();

		my1.test();
		my1.test(5);
		my1.test(5,8.5);


		my1.type(5.0);
		my1.type(5.0f);
		my1.type(5);
	}
}
