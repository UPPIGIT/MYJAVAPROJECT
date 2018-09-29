package StringPkgDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringExampleDemo7 {

	
	public static void countDublicateChars(String str)
	{
	
		Map<Character, Integer> map= new HashMap<>();
		
		char[] ch= str.toCharArray();
		
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				
			} else {
				map.put(c, 1);
			}
		}
		
		
		Set<Character> set=map.keySet();
		
		for (Character character : set) {
			if (map.get(character)>1) {
				
				System.out.println("char :"+character+" " +map.get(character));
				
			} 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String st1="upender tadewar";
	
	countDublicateChars(st1);
	
	String st2="abcdavbgdscdfgrdsardaswegvccxzasfrrewqad";
	
	countDublicateChars(st2);

	}

}
