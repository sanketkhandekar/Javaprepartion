package com.pratice.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
 
public class TreeMapDemo {
     
    public static void main(String a[]){
        //the treemap sorts by key
        TreeMap<String, String> hm = new TreeMap<String, String>(new MyCompr());
        //add key-value pair to TreeMap
        hm.put("java", "language");
        hm.put("computer", "machine");
        hm.put("india","country");
        hm.put("mango","fruit");
        hm.put("game","cricket");
        System.out.println("TreeMap Entries:");
        System.out.println(hm);
        Map<String, String> subMap1 = hm.subMap("game", "java");
        System.out.println("Sub-Map enties:");
        System.out.println(subMap1);
        //how to get lower boundary also part of sub-map
        Map<String, String> subMap2 = hm.subMap("game", true, "java", true);
        System.out.println("Sub-Map enties:");
        System.out.println(subMap2);
        //how to omit upper boundary in the sub-map
        Map<String, String> subMap3 = hm.subMap("game", false, "java", true);
        System.out.println("Sub-Map enties:");
        System.out.println(subMap3);
        
Map<String,String> treemap = new TreeMap<>();
		
		treemap.put("F", "Q");
		treemap.put("S", "R");
		treemap.put("Z", "S");
		treemap.put("V", "C");
		treemap.put("H", "Z");
		
		System.out.println(treemap);
/*		
		treemap = new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		*/
		treemap.put("F", "Q");
		treemap.put("S", "R");
		treemap.put("Z", "S");
		treemap.put("V", "C");
		treemap.put("H", "Z");
		
		System.out.println(treemap);
		/*Comparator<String> comparator = new ValueComparator<String,String>(treemap);
		 * 		TreeMap<String,String> object = new TreeMap<String,String>(comparator);
		 */
		
		//Map<String, String> sortedByValues =ValueComparator.sortByValues(treemap);
		
		Comparator<String> comparator = new ValueComparator<>(treemap);
		
		TreeMap<String, String> object = new TreeMap<>(comparator);
		
		object.putAll(treemap);
		
		Set<Entry<String,String>> entries = object.entrySet();
		
		for (Entry<String, String> entry : entries) {

			System.out.println("enties "+entry.getKey());	
		}
		
		
		
		System.out.println("object "+object);
		
    }
}
 
class MyCompr implements Comparator<String>{
 
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
     
}