package collections.MapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    LinkedHashMap<Integer, String> LHM= new LinkedHashMap<>();//insertion order preserved
		
		LHM.put(10001,"abc");
		LHM.put(10002, "bbb");
		LHM.put(77777,"ccc");
		LHM.put(55555, "ddd");
		LHM.put(33333,"eee");//duplicate key not allowed .. replace key with new value
		LHM.put(22222, "bbb");//map can have duplicate values
		LHM.put(10006,"abc");
		LHM.put(88888,"abc");
		LHM.put(99999,"abc");
		LHM.put(null, "bbb");
		LHM.put(null, "ggg");//map allow only one null key
		LHM.put(10007,null);
		LHM.put(10008, null);// map can have any no of null values
		
		System.out.println(LHM);
		
		  LinkedHashMap<String, Integer> LHM1= new LinkedHashMap<>();
		  
		  LHM1.put("abc", 1000);
		  LHM1.put("123", 1000);
		  LHM1.put("aaa", 1000);
		  LHM1.put("bbb", 1000);
		  LHM1.put("ccc", 1000);
		  
		  System.out.println(LHM1);

	}

}

/*
{10001=abc, 10002=bbb, 77777=ccc, 55555=ddd, 33333=eee, 22222=bbb, 10006=abc, 88888=abc, 99999=abc, null=ggg, 10007=null, 10008=null}
*/