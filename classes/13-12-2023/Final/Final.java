import java.io.*;
import java.util.Scanner;

class Final
{
	public static void main(String args[]) {
		Scanner std = new Scanner(System.in);
		int num = std.nextInt();
		num++;
		num--;
		num *= 10;
		final int finalNum = num;
		finalNum = 234; // Raises error. Final like dart. Const
						// doesn't exist.
	}
}
