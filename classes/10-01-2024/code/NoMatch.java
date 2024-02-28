package code;

import java.lang.Exception;
import java.util.Scanner;

class NoMatchException extends Exception {
    NoMatchException(String message) {
	super(message);
    }
}

class NoMatch
{

    public static void main(String[] artStrings) {
	Scanner stdin = new Scanner(System.in);

	s1 = "BANGLADESH";
	String s2 = stdin.next();

	try {
	    if(!s2.equals(s1)) {
		throw new NoMatchException("Strings do not match");
	    }
	}
	catch(NoMatchException e){
	    System.out.println(e.getMessage());
	}


	stdin.close();
    }
}
