import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] argString) throws IOException
    {
	File inFile = new File("./in");
	File outFile = new File("./out");
	BufferedReader buffer
	    = new BufferedReader(new FileReader(inFile));
	FileWriter outWriter = new FileWriter(outFile);
	String inStr;
	while((inStr = buffer.readLine()) != null) {

	}
    }
}
