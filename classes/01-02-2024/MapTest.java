package similarity;

import java.util.Map;
import java.util.TreeMap;

class MapTest
{
    public static void main(String[] argStrings)
    {
	Map<String,Integer> sampleMap=new TreeMap<String,Integer>();
	sampleMap.put("std1", 60);
	sampleMap.put("std2", 70);
	sampleMap.put("std3", 80);
	sampleMap.put("std4", 90);

	System.out.println(sampleMap);

	for(var mapKey: sampleMap.keySet()) {
	    System.out.println(mapKey);
	}
	for(var mapKey: sampleMap.keySet()) {
	    System.out.println(sampleMap.get(mapKey));
	}
    }
}
