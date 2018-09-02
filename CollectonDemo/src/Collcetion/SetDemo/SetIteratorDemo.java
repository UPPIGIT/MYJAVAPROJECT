package Collcetion.SetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class SetIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashSet<Integer> hashSet= new HashSet<>();
		
		System.out.println(hashSet.size());  //0
		System.out.println(hashSet.isEmpty());//true
		
		//add
		
		
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
		
		System.out.println(hashSet);
		
		Iterator<Integer> setitr= hashSet.iterator();
	/*	
		hashSet.add(888);
		Exception in thread "main" java.util.ConcurrentModificationException
		at java.base/java.util.HashMap$HashIterator.nextNode(Unknown Source)
		at java.base/java.util.HashMap$KeyIterator.next(Unknown Source)
		at Collcetion.SetDemo.SetIteratorDemo.main(SetIteratorDemo.java:39)*/
		
		
		while (setitr.hasNext()) {
			Integer integer = (Integer) setitr.next();
			System.out.println(integer);
			
		}
	}

}
