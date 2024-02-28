package GeoSeperateFiles;

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
