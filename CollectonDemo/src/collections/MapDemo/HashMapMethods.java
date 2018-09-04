package collections.MapDemo;

import java.util.HashMap;

public class HashMapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map= new HashMap<>();
		
		map.put(101, "aaa");
		map.put(102, "bbb");
		map.put(103, "ccc");
		map.put(104, "ddd");
		map.put(105, "eee");
		map.put(106, "fff");
		map.put(107, "ggg");
		map.put(108, "hhh");
		map.put(109, "iii");
		map.put(110, "jjj");
		
		System.out.println(map);
		
		HashMap<Integer, String> anotherMap= new HashMap<>();
		
		anotherMap.put(1001, "lll");
		anotherMap.put(1002, "mmm");
		anotherMap.put(1003, "kkk");
		anotherMap.put(1004, "rrr");
		
		map.putAll(anotherMap);
		
		System.out.println(map);
		
		/*{101=aaa, 102=bbb, 103=ccc, 104=ddd, 105=eee, 106=fff, 107=ggg, 108=hhh, 109=iii, 110=jjj}
		{101=aaa, 102=bbb, 103=ccc, 104=ddd, 105=eee, 1001=lll, 106=fff, 1002=mmm, 107=ggg, 1003=kkk, 108=hhh, 1004=rrr, 109=iii, 110=jjj}
*/
		
		HashMap<String, Integer> mapdemo = new HashMap<>();
		
		mapdemo.put("abc", 1101);
		mapdemo.put("ccc", 1102);
		mapdemo.put("ddd", 1103);
		mapdemo.put("eee", 1104);
		
		System.out.println(mapdemo);
		
		mapdemo.put("123", 1235);//objects should not be in comparable
		mapdemo.put("123", 2222);
		
		System.out.println(mapdemo);
		
		
	}

}
