package collections.MapDemo;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap= new TreeMap<>();
		
		//treeMap.put(null, "abc"); single null also not allowed in TreeMap//NPE
		
		treeMap.put(101, "abc");
		treeMap.put(102, "lmn");
		treeMap.put(103, "aaa");
		treeMap.put(104, "ccc");
		treeMap.put(105, "ddd");
		treeMap.put(101, "xyz");// if key already present ,value replaced with new value
		treeMap.put(106, null);
		treeMap.put(107, "null");//allow multiple nulls
		
		
		System.out.println(treeMap); // natural sorting order(Ascending order)
		
		//{101=xyz, 102=lmn, 103=aaa, 104=ccc, 105=ddd, 106=null, 107=null}
	}

}
