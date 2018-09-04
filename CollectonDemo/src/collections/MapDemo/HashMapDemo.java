package collections.MapDemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map= new HashMap<>();
		
		map.put(101,"abc");
		map.put(102, "bbb");
		map.put(103,"ccc");
		map.put(104, "ddd");
		map.put(101,"eee");//duplicate key not allowed .. replace key with new value
		map.put(105, "bbb");//map can have duplicate values
		map.put(106,"abc");
		map.put(null, "bbb");
		map.put(null, "ggg");//map allow only one null key
		map.put(107,null);
		map.put(108, null);// map can have any no of null values
		
		System.out.println(map);
		
		

	}

}

/*{null=ggg, 101=eee, 102=bbb, 103=ccc, 104=ddd, 105=bbb, 106=abc, 107=null, 108=null}*/
