package code;

public class FinallyExample {
    public static void main(String[] argStrings) {
	int a[] = {5, 10};
	int b = 5;
	try {
	    int x = a[2] / b - a[1];
	}
	catch(ArithmeticException e) {
	    System.out.println("Division by Zero");
	}
	catch(ArrayIndexOutOfBoundsException e) {
	    System.out.println("Array Index Error");
	}
	catch(ArrayStoreException e) {
	    System.out.println("Wrong data type");
	}
	finally {
	    int y = a[1] / a[0];
	    System.out.println("y = " + y);
	}
    }
}
