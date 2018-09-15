package ConcurrentPkgDemo;

import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ConcurrentHashMap<Integer, String> CHM = new ConcurrentHashMap<>();
		
		CHM.put(1001, "aaa");
		CHM.put(1002, "bbb");
		CHM.put(1003, "ccc");
		CHM.put(1004, "ddd");
		CHM.put(1005, "eee");
		CHM.put(1006, "fff");
	//	CHM.put(1111, null);NPE
	//	CHM.put(null, "PQR");NPE
		CHM.put(1001, "XYZ");//replace value
		
	System.out.println(CHM.putIfAbsent(1001, "ZZZZZ"));	
	System.out.println(CHM.putIfAbsent(1010, "Over"));
	
	System.out.println(CHM.remove(1002, "bbb"));
	System.out.println(CHM.remove(1005, "bbb"));

	
	System.out.println(CHM.replace(1003, "ccc", "laxman"));
	System.out.println(CHM.replace(1, "eee", "laxman"));
	System.out.println(CHM.replace(1006, "kkk", "oooo"));
	
	
		Set<Entry<Integer, String>> entry= CHM.entrySet();
		
		Iterator<Entry<Integer, String>> itr=entry.iterator();
		while (itr.hasNext()) {
			Map.Entry<java.lang.Integer, java.lang.String> entry2 = (Map.Entry<java.lang.Integer, java.lang.String>) itr
					.next();
			
			System.out.println(entry2);
			
		}
		
		

	}

}
