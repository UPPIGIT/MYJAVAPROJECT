package ConcurrentPkgDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapThreadOne extends Thread{
	
	static  HashMap<Integer, String> M = new HashMap<>(); //java.util.ConcurrentModificationException
	
	static Map<Integer, String> HM=Collections.synchronizedMap(M);//HM should be declared with synchronized block otherwise throws ConcurrentModificationException 
	
	
	@Override
	public void run() {
		
		HM.put(106, "abc");
		HM.put(107, "ddd");
		HM.put(108, "dlm");
		HM.put(109, "kkk");
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		HM.put(101, "abc");
		HM.put(102, "ddd");
		HM.put(103, "dlm");
		HM.put(104, "kkk");
		HM.put(105, "hhh");
		
		MapThreadOne t1= new MapThreadOne();
		t1.start();
		
		Set<Entry<Integer, String>> set=HM.entrySet();
		
		/*Iterator<Entry<Integer, String>> itr=set.iterator();
		while (itr.hasNext()) {
			Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) itr
					.next();
			
			System.out.println(entry);
		}*/
		
		synchronized (HM) {
			Iterator<Entry<Integer, String>> itr=set.iterator();
			while (itr.hasNext()) {
				Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) itr
						.next();
				
				System.out.println(entry);
			}
		}
		Thread.sleep(2000);
		System.out.println(HM);
	}

}
