package collections.MapDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map= new HashMap<>();// Insertion order not preserved
		
		map.put(10001,"abc");
		map.put(10002, "bbb");
		map.put(77777,"ccc");
		map.put(55555, "ddd");
		map.put(33333,"eee");//duplicate key not allowed .. replace key with new value
		map.put(22222, "bbb");//map can have duplicate values
		map.put(10006,"abc");
		map.put(88888,"abc");
		map.put(99999,"abc");
		map.put(null, "bbb");
		map.put(null, "ggg");//map allow only one null key
		map.put(10007,null);
		map.put(10008, null);// map can have any no of null values
		
		System.out.println(map);
		
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
		
		
	Map<Integer, String> shm= Collections.synchronizedMap(map);
		
		System.out.println(shm);
		
		
		
		
		

	}

}

/*{77777=ccc, null=ggg, 10001=abc, 10002=bbb, 55555=ddd, 33333=eee, 10006=abc, 10007=null, 10008=null, 88888=abc, 22222=bbb, 99999=abc}
{10001=abc, 10002=bbb, 77777=ccc, 55555=ddd, 33333=eee, 22222=bbb, 10006=abc, 88888=abc, 99999=abc, null=ggg, 10007=null, 10008=null}

*/