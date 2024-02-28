class Coordinate
{
	int x;
	int y;

	Coordinate(int xIn, int yIn) {
		this.x = xIn;
		this.y = yIn;
	}

	void show() {
		System.out.printf("%d\t%d\n", this.x, this.y);
	}
}


class Rectangle
{
	Coordinate topLeft;
	Coordinate bottomRight;

	Rectangle(Coordinate topLeftIn, Coordinate bottomRightIn) {
		this.topLeft = topLeftIn;
		this.bottomRight = bottomRightIn;
	}

	void show() {
		System.out.print("Top left\t: ");
		this.topLeft.show();
		System.out.print("Bottom right\t: ");
		this.bottomRight.show();
	}
}


public class Geo {
	public static void main(String args[]) {
		Rectangle rectObj =
			new Rectangle(new Coordinate(1,2),
						  new Coordinate(3,4)
						  );
		rectObj.show();
	}
}
