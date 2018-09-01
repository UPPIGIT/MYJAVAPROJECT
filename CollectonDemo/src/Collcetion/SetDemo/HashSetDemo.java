package Collcetion.SetDemo;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs= new HashSet<>();
		
		hs.add(10);
		hs.add(20);
		hs.add(55);
		hs.add(36);
		hs.add(10);//dublicates not allowed
		hs.add(77);
		hs.add(88);
		hs.add(null);
		hs.add(null);//only 1 null allowed
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
	}

}
