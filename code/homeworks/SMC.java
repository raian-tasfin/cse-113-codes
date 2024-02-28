package homework;

import java.util.*;

class SMC
{
    static double get_smc(String strA, String strB) throws Exception
    {
	// pad with zeroes
	int cntRequiredBits = strA.length() - strB.length();
	for(int counter = 1; counter <= cntRequiredBits; counter++) {
	    strA = "0".concat(strA);
	}
	cntRequiredBits = strB.length() - strA.length();
	for(int counter = 1; counter <= cntRequiredBits; counter++) {
	    strB = "0".concat(strB);
	}

	char[] arrA = strA.toCharArray();
	char[] arrB = strB.toCharArray();

	int[] freqCounter = new int[4];
	for(int indx = 0; indx < arrA.length; indx++) {

	    if(arrA[indx] != '0' && arrA[indx] != '1') {
		throw new Exception("strA not a binary string.");
	    }
	    if(arrB[indx] != '0' && arrB[indx] != '1') {
		throw new Exception("strB not a binary string.");
	    }
	    int key =
		((int) arrA[indx]-'0') +
		2 * ((int) arrB[indx]-'0');
	    freqCounter[key]++;
	}

	double res = 0.0;
	for(var freq: freqCounter) {
	    res += freq;
	}
	res = (freqCounter[0] + freqCounter[3]) / res;
	return res;
    }

    public static void main(String[] argStrings)
    {
	Scanner stdin = new Scanner(System.in);
	String strA = stdin.next();
	String strB = stdin.next();

	double res = 0.0;
	try {
	    res = get_smc(strA, strB);
	    System.out.println(res);
	} catch(Exception exc) {
	    exc.printStackTrace();
	}

	stdin.close();
    }
}
