package ConcurrentPkgDemo;

import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConThreadOne extends Thread {
	
 static	ConcurrentHashMap<Integer, String> CHM= new ConcurrentHashMap<>();
 
	@Override
	public void run() {
		
		CHM.put(106, "abc");
		CHM.put(107, "ddd");
		CHM.put(108, "dlm");
		CHM.put(109, "kkk");
		
	}

	
	public static void main(String[] args) throws InterruptedException {
		

		CHM.put(1001, "aaa");
		CHM.put(1002, "bbb");
		CHM.put(1003, "ccc");
		CHM.put(1004, "ddd");
		CHM.put(1005, "eee");
		CHM.put(1006, "fff");
		
		ConThreadOne t1= new ConThreadOne();
		t1.start();
		
		Set<Entry<Integer, String>> set= CHM.entrySet();
		
		Iterator<Entry<Integer, String>> iterator= set.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) iterator
					.next();
			System.out.println(entry);
		}
		
		Thread.sleep(2000);
		
		System.out.println(CHM);
		
	}

}
