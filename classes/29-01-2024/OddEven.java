import java.io.*;
import java.io.IOException;

public class OddEven
{
    public static void main(String[] argStrings) // throws IOException
    {
	File inFile = new File("./num");
	File oddFile = new File("./odd");
	File evenFile = new File("./even");

	BufferedReader ins = null;
	FileWriter odd = null;
	FileWriter even = null;

	try {
	    ins = new BufferedReader(new FileReader(inFile));
	    odd = new FileWriter(oddFile);
	    even = new FileWriter(evenFile);

	    String intr;
	    String fileData = "";
	    while((intr = ins.readLine()) != null) {
		fileData += intr + " ";
	    }
	    String delims = " ";
	    String[] token = fileData.split(delims);
	    int word;
	    for(int i = 0; i < token.length; i++) {
		word = Integer.parseInt(token[i]);
		if(word % 2 == 0) {
		    even.write(word+delims);
		} else {
		    odd.write(word+delims);
		}
	    }
	} catch(IOException exception) {
	    System.out.println(exception);
	    System.exit(-1);
	}
	finally {
	    try {
		ins.close();
		odd.close();
		even.close();
	    } catch (IOException exception) {
		System.out.println(exception);
	    }
	}
    }
}
