package collections.MapDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Integer,String> map= new HashMap<>();
		
		System.out.println("is empty :"+map.isEmpty());
		System.out.println("size of the map :"+map.size());
		
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
		
		System.out.println("get value from map :"+map.get(106));
		System.out.println("get value from map :"+map.get(125));
		System.out.println("get value from map :"+map.get(null));
		
/*{101=aaa, 102=bbb, 103=ccc, 104=ddd, 105=eee, 106=fff, 107=ggg, 108=hhh, 109=iii, 110=jjj}
get value from map :fff
get value from map :null
get value from map :null*/
		
		System.out.println("is empty :"+map.isEmpty());
		System.out.println("size of the map :"+map.size());
		
		System.out.println("remove :"+map.remove(109));//iii
		System.out.println("remove :"+map.remove(123));//null
		System.out.println("remove :"+map.remove(106, "fff")); //true //remove if the specified key is currently mapped to given value
		System.out.println("remove :"+map.remove(105, "string"));//false
		
		System.out.println("contains Key 102:"+map.containsKey(102)); //true
		System.out.println("contains Key 1000:"+map.containsKey(1000));//false
		
		System.out.println("Contains value aaa :"+map.containsValue("aaa"));//true
		System.out.println("contains value mnb:"+map.containsValue("mnb"));//false
		
		System.out.println("values :"+map.values());
		
		System.out.println("keys :"+map.keySet());
		
		System.out.println("entry set :"+map.entrySet());
		
		System.out.println(map.getOrDefault(101, "abc"));
		System.out.println(map.getOrDefault(123, "abc"));/*key the key whose associated value is to be returneddefaultValue the default mapping of the key*/
		
		System.out.println("putIfAbsent :"+map.putIfAbsent(104, "xyz"));
		System.out.println("putIfAbsent :"+map.putIfAbsent(123, "mystring"));
		System.out.println(map);/*{101=aaa, 102=bbb, 103=ccc, 104=ddd, 105=eee, 106=fff, 107=ggg, 123=mystring, 108=hhh, 110=jjj}*/
		
		System.out.println("replace :"+map.replace(110, "jjj", "newstring"));//true
		System.out.println("replace :"+map.replace(123, "jjj", "newstring"));//false
	
		
		System.out.println("replace :"+map.replace(108, "my value"));//returns old value if replace value else null
		System.out.println("replace :"+map.replace(152, "my value"));//null
		System.out.println(map);
		
		//getting synchronized map
		
		System.out.println("synchronized map======================");
		
		Map<Integer, String> syncMap = Collections.synchronizedMap(map);
		
		System.out.println(syncMap);
		
		
		
		
	}

}
