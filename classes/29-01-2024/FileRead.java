import java.util.*;
import java.io.*;

class FileRead
{
    public static void main(String[] argStrings)
    {
	File inFile = new File("./num");
	File outFile = new File("./parsedNums");

	BufferedReader buffer = null;
	FileWriter outWriter = null;

	try {
	    outWriter = new FileWriter(outFile);
	    buffer = new BufferedReader(new FileReader(inFile));
	    String inStr;
	    String fileData = "";
	    while((inStr = buffer.readLine()) != null) {
		fileData += inStr + " ";
	    }
	    String delims = "[ ,.,=]";
	    String[] tokens = fileData.split(delims);

	    int num = 0;
	    for(String token: tokens) {
		num = Integer.parseInt(token);
		outWriter.write(num + "\n");
	    }
	} catch (IOException exception) {
	    System.out.println(exception);
	    System.exit(-1);
	} finally {
	    try {
		buffer.close();
		outWriter.close();
	    } catch(IOException exception) {
		System.out.println(exception);
	    }
	}
    }
}
