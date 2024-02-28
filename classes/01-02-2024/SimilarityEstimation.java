import java.util.*;

public class SimilarityEstimation
{
    public static void main(String[] argStrings)
    {
	String testString1 = "the best data science course in the Engg course";
	Map<String, Integer> wordFrequency = new HashMap<String, Integer>();
	Integer count = null;

	String delims = " ";
	String[] tokens=testString1.toLowerCase().split(delims);
	String word;

	for(int indx = 0; indx < tokens.length; indx++) {
	    word = tokens[indx];
	    count = wordFrequency.get(word);
	    if(count == null) {
		count = 1;
	    }
	    else {
		count = count + 1;
	    }
	    wordFrequency.put(word, count);
	}
	System.out.println(wordFrequency);
    }
}
