package similarity;

import java.util.*;

class SimilarityDescriptor
{

    static Map<String, Integer> wordFreqEstimation(String testString)
    {
	Map<String, Integer> wordFrequency = new HashMap<String, Integer>();
	Integer count = null;

	String delims = " ";
	String[] tokens=testString.trim().toLowerCase().split(delims);
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
	return wordFrequency;
    }

    static Double cosineSimilarity(String text1, String text2)
    {
	Map<String, Integer> docfreq1 = wordFreqEstimation(text1);
	Map<String, Integer> docfreq2 = wordFreqEstimation(text2);

	Double cosine_similarity;
	double mul = 0.0f;
	double fr1 = 0.0f;
	double fr2 = 0.0f;

	for(String key1: docfreq1.keySet()) {
	    fr1 = fr1 + Math.pow(docfreq1.get(key1), 2);
	}
	for(String key2: docfreq2.keySet()) {
	    fr2 = fr2 + Math.pow(docfreq2.get(key2), 2);
	}
	for(String key1:docfreq1.keySet()) {
	    if(docfreq2.containsKey(key1)) {
		mul = mul + docfreq1.get(key1) * docfreq2.get(key1);
	    }
	}
	cosine_similarity = (Double)(mul/Math.sqrt(fr1*fr2));
    }
}

public class SimilarityEstimation2
{
    public static void main(String[] argStrings)
    {
	String testString1 = "the best data science course in the Engg course";
	var similarityObj = new SimilarityDescriptor();
	var wordFreq = similarityObj.wordFreqEstimation(testString1);
	System.out.println(wordFreq);
    }
}
