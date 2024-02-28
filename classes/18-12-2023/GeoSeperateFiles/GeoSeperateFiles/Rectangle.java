package GeoSepearteFiles;

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
