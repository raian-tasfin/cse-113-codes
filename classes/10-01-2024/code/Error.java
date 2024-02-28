package code;

public class Error
{
    public static void main(String[] argStrings) {
	int[] arr = {5, 7, 8, 12, 10};
	int b = 7;

	for(int indx = 0; indx < 7; indx++) {
	    arr[indx] = b / (arr[indx] - b);
	}
    }
}
