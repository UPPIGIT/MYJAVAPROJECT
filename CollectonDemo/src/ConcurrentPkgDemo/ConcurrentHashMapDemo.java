package ConcurrentPkgDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map.Entry;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> HM= new HashMap<>();
		
		HM.put(1001, "aaa");
		HM.put(1002, "bbb");
		HM.put(1003, "ccc");
		HM.put(1004, "ddd");
		HM.put(1005, "eee");
		HM.put(1006, "fff");
		
		Set<Entry<Integer, String>> mapset=HM.entrySet();
		
		Iterator<Entry<Integer, String>> keyItr= mapset.iterator();
		//HM.put(1007, "lll");   java.util.ConcurrentModificationException
		while (keyItr.hasNext()) {
			Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) keyItr
					.next();
			
			System.out.println(entry);
			
		}
		
/*		Map<Integer, String> syncMap=Collections.synchronizedMap(HM);
		
		Set<Entry<Integer, String>> syncSet=syncMap.entrySet();
		
		Iterator<Entry<Integer, String>> iterator= syncSet.iterator();
		//HM.put(1007, "lll");java.util.ConcurrentModificationException
		
		while (iterator.hasNext()) {
			Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) iterator
					.next();
			System.out.println(entry);
		}*/
		
		
		Map<Integer, String> syncMap=Collections.synchronizedMap(HM);
		
		Set<Entry<Integer, String>> syncSet=syncMap.entrySet();
		
		synchronized (syncMap) {
			
			Iterator<Entry<Integer, String>> iterator= syncSet.iterator();
			//HM.put(1007, "lll");java.util.ConcurrentModificationException
			
			while (iterator.hasNext()) {
				Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) iterator
						.next();
				System.out.println(entry);
			}
			
			ConcurrentHashMap<Integer, String> CHM = new ConcurrentHashMap<>();
			
			CHM.put(1001, "aaa");
			CHM.put(1002, "bbb");
			CHM.put(1003, "ccc");
			CHM.put(1004, "ddd");
			CHM.put(1005, "eee");
			CHM.put(1006, "fff");
			
			Set<Entry<Integer, String>> conSet=CHM.entrySet();
			Iterator<Entry<Integer, String>> conItr= conSet.iterator();
			
			CHM.put(1007, "ggg");
			
			while (conItr.hasNext()) {
				Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) conItr
						.next();
				System.out.println(entry);
			}
			
			
		}
		
	
		

	}

}
