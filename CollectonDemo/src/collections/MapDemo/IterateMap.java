package collections.MapDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMap {

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
		
		
		System.out.println("entry set iteration================");
		
	Set<Entry<Integer, String>> setEntrySet =map.entrySet();
	
	Iterator<Entry<Integer, String>> itr=setEntrySet.iterator();
	
	while (itr.hasNext()) {
		Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) itr
				.next();
		
		//System.out.println(entry);
		
		System.out.println("key:"+entry.getKey()+" "+"value:"+entry.getValue());
		
		
	}

	System.out.println("keySet iteration================");
		Set<Integer> keys=map.keySet();
		
		Iterator<Integer> keysitr= keys.iterator();
		
		while (keysitr.hasNext()) {
			Integer key = (Integer) keysitr.next();
			
			System.out.println("Key :"+key+"  value :"+map.get(key));
		}
		
		System.out.println("values iteration================");
		
		Collection<String> mapValues = map.values();
		
		Iterator<String> valuesItr=mapValues.iterator();
		
		while (valuesItr.hasNext()) {
			String value = (String) valuesItr.next();
			
			System.out.println("value :"+value);
			
		}
		
	}

}
