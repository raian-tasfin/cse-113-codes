package variables;

class Coordinate
{
	final static String whomai = "Coordinate";
	int x;
	int y;

	public Coordinate(int xIn, int yIn) {
		this.x = xIn;
		this.y = yIn;
	}

	Coordinate() {
		this.x = 0;
		this.y = 0;
	}

	static void show() {
		System.out.println("Shown.");
	}
}

class Child extends Coordinate {
	static void show() {
		System.out.println("Child");
	}
}

public class Main
{
	public static void main(String args[]) {
		Coordinate.show();
		Child.show();
	}
}
