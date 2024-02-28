package similarity;
import java.util.*;
import java.io.*;

class SimilarityDescriptor
{
    Map<String, Integer> frequency = new HashMap<String, Integer>();

    void update_frequency(String[] newWords)
    {
	for(var word: newWords) {
	    Integer count = frequency.get(word);
	    count = count == null ? 1 : count + 1;
	    frequency.put(word, count);
	}
    }

    Double vectorLen()
    {
	var keySet = this.frequency.keySet();
	Double len = 0.0;
	for(var key: keySet) {
	    len += Math.pow(this.frequency.get(key), 2.0);
	}
	return Math.sqrt(len);
    }

    Double vectorDot(SimilarityDescriptor rhs)
    {
	Double ans = 0.0;
	var keySet = this.frequency.keySet();
	for(var key: keySet) {
	    var rhsKey = rhs.frequency.get(key);
	    if(rhsKey != null) {
		ans += this.frequency.get(key) * rhsKey;
	    }
	}
	return ans;
    }

    Double cosineSimilarityWith(SimilarityDescriptor rhs)
    {
	return this.vectorDot(rhs)/(this.vectorLen() * rhs.vectorLen());
    }
}

class Similarity
{
    static String[] get_tokens_from_file(String fileName) throws IOException
    {
	File inFile = new File(fileName);
	BufferedReader buff = new BufferedReader(new FileReader(inFile));
	String fileData = "";
	String inString;
	while((inString = buff.readLine()) != null) {
	    fileData += inString + " ";
	}

	return fileData.trim().toLowerCase().split(" ");
    }

    public static void main(String[] argStrings) throws IOException
    {
	String[] tokens1 = get_tokens_from_file("./data1");
	String[] tokens2 = get_tokens_from_file("./data2");

	var desc1 = new SimilarityDescriptor();
	var desc2 = new SimilarityDescriptor();

	desc1.update_frequency(tokens1);
	desc2.update_frequency(tokens2);

	System.out.println(desc1.cosineSimilarityWith(desc2));
	var ang = Math.acos(desc1.cosineSimilarityWith(desc2));
	System.out.println(ang * 180.0 / Math.PI);
    }
}
