package Collcetion.SetDemo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SynchHashSet {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hashSet= new HashSet<>();
		
	
		System.out.println(hashSet.add(11));
		System.out.println(hashSet.add(22));
		System.out.println(hashSet.add(33));
		System.out.println(hashSet.add(44));
		System.out.println(hashSet.add(55));
		System.out.println(hashSet.add(66));
		System.out.println(hashSet.add(77));
		System.out.println(hashSet.add(11)); // dublicates not allowed returns false
		System.out.println(hashSet.add(null));
		System.out.println(hashSet.add(11));//false
		System.out.println(hashSet.add(99));
		System.out.println(hashSet.add(null));// only one nulll allowed//false
		
		System.out.println("non synhronized set :"+hashSet);
		
		Set<Integer> hashset1=Collections.synchronizedSet(hashSet);
		
		System.out.println("Synhronized Hashset "+hashset1);
	}

}

/*true
true
true
true
true
true
true
false
true
false
true
false
non synhronized set :[null, 33, 66, 99, 22, 55, 11, 44, 77]
Synhronized Hashset [null, 33, 66, 99, 22, 55, 11, 44, 77]*/