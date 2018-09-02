package Collcetion.SetDemo;

import java.util.Arrays;
import java.util.HashSet;

public class HashsetMethods {
	
	public static void main(String[] args) {
		
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
		
		//size
		System.out.println("size :"+hashSet.size());
		
		
		System.out.println(hashSet.size());//9
		System.out.println(hashSet.isEmpty());//false
		
		System.out.println(hashSet.contains(55));  //true
		System.out.println(hashSet.contains(555)); //false
		
		//addAll()
		
	    System.out.println(hashSet.addAll(Arrays.asList(74,85,96,14,25,36,74))); //true
		System.out.println(hashSet);
		
		//remove
		
		System.out.println(hashSet.remove(74)); //true
		System.out.println(hashSet.removeAll(Arrays.asList(14,25,66,999))); //true
		System.out.println(hashSet);
		
		System.out.println(hashSet.containsAll(Arrays.asList(11,33,44)));  //true
		System.out.println(hashSet.containsAll(Arrays.asList(123,11,789,77)));//false
		
		System.out.println(hashSet.retainAll(Arrays.asList(11,22,33,44,55,66,77))); //remove all elementns expect given collection
		System.out.println(hashSet);
		
		
		//Integer intarray[] =(Integer[])hashSet.toArray();
		/*Exception in thread "main" java.lang.ClassCastException: java.base/[Ljava.lang.Object; cannot be cast to java.base/[Ljava.lang.Integer;
	at Collcetion.SetDemo.HashsetMethods.main(HashsetMethods.java:61)*/
		
		Object[] object =hashSet.toArray();
		for (Object object2 : object) {
			System.out.println((Integer)object2);
		}
		
	}

}
