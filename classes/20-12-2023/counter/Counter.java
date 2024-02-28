package counter;

class RefCounter
{
	private static int cnt;

	RefCounter() {
		RefCounter.cnt++;
		System.out.printf("New reference added. Current cnt: %d\n", RefCounter.cnt);
	}

	void close() {
		if(RefCounter.cnt == 0) {
			System.out.println("No references exist");
			System.exit(-1);
		}
		RefCounter.cnt--;
		System.out.printf("Closed 1. Remaining %d\n", RefCounter.cnt);
	}
}

class Counter
{
	public static void main(String args[]) {
		RefCounter refs[] = new RefCounter[5];
		for(int indx = 0; indx < 5; indx++) {
			refs[indx] = new RefCounter();
		}
		for(int indx = 0; indx < 5; indx++) {
			refs[indx].close();
		}
		refs[0].close();
	}
}
