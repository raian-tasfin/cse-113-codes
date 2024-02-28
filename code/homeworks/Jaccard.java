package homework;

import java.util.*;
import java.io.*;

class Jaccard
{
    static String[] tokenize_file(String filePath) throws IOException
    {
	File inFile = new File(filePath);
	BufferedReader buff =
	    new BufferedReader(new FileReader(inFile));
	String inStr;
	String data = "";
	while((inStr = buff.readLine()) != null) {
	    data += inStr + " ";
	}
	String[] tokens = data.trim().toLowerCase().split(" ");
	return tokens;
    }

    static int tokens_union_len(String[] listA, String[] listB)
    {
	Set<String> set = new HashSet<String>();
	for(var token: listA) {
	    set.add(token);
	}
	for(var token: listB) {
	    set.add(token);
	}
	return set.size();
    }

    static int tokens_intersection_len(String[] listA, String[] listB)
    {
	Set<String> setA = new HashSet<String>();
	Set<String> setB = new HashSet<String>();

	for(var token: listA) {
	    setA.add(token);
	}
 	for(var token: listB) {
	    setB.add(token);
	}
	Set<String> setIntersect = new HashSet<String>();
	for(var token: listA) {
	    if(setA.contains(token) && setB.contains(token)) {
		setIntersect.add(token);
	    }
	}
	return setIntersect.size();
    }

    static double jaccard_similarity(String[] tokenList1,
				     String[] tokenList2)
    {
	double intersectLen =
	    tokens_intersection_len(tokenList1, tokenList2);
	double unionLen = tokens_union_len(tokenList1, tokenList2);
	return intersectLen / unionLen;
    }

    public static void main(String[] argStrings) throws IOException
    {
	String[] tokenList1 = tokenize_file("./data1");
	String[] tokenList2 = tokenize_file("./data2");

	System.out.println(jaccard_similarity(tokenList1,
					      tokenList2));
    }
}
