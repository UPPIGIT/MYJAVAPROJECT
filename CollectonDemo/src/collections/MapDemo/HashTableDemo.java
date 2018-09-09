package collections.MapDemo;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> ht= new Hashtable<>();
		
		//ht.put(null, "abc");// single null key also not allowed
		
		
		ht.put(10001,"abc");
		ht.put(10002, "bbb");
		ht.put(77777,"ccc");
		ht.put(55555, "ddd");
		ht.put(33333,"eee");
		ht.put(22222, "bbb");
		ht.put(10006,"abc");
		ht.put(88888,"abc");
		ht.put(99999,"abc");
	//	ht.put(null, "bbb");
		//ht.put(null, "ggg");
	//	ht.put(10007,null); value cannot be null
	//	ht.put(10008, null);
		
		System.out.println(ht);

	}

}
