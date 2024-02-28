import java.util.*;

class Main
{
    public static void main(String[] argStrings)
    {
	List<String> al = new ArrayList<>();
	String[] test = {"alif", "baa", "taa", "saa"};

	al.add("mango");
	al.add("orange");
	al.add("orange");
	al.add("orange");
	al.add("grapes");
	for(String fruit: al) {
	    System.out.println(fruit);
	}
	al.remove("orange");
	System.out.println();
	for(String fruit: al) {
	    System.out.println(fruit);
	}
	System.out.println();
	Set<String> set = new HashSet<String>();
	set.add("one");

	set.add("two");
	set.add("three");
	set.add("four");
	set.add("five");

	System.out.println(set);
    }
}
