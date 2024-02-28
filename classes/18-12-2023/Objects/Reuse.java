class A {
	int input1 = 5;
	String myString = "CSECU";

	void show() {
		System.out.println("My Name is: ");
	}

	void show(String name) {
		System.out.println("My Name is: " + name);
	}
}

class B extends A {
	String myString = "B String";

	void show() {
		System.out.println("show b");
	}
}

class C extends A {
	String myString = "C string";
}

public class Reuse {
	public static void main(String args[]) {
		A objA = new A();
		B objB = new B();
		C objC = new C();

		System.out.println(objA.myString);
		System.out.println(objB.myString);
		System.out.println(objC.myString);
	}
}
