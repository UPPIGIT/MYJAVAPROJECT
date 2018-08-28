package collection.ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedListDemo {
	
	public static void main(String[] args) {
		
		/*Method-1*/
		
	//non sync list
		ArrayList<String> AL = new ArrayList<>();
		
		AL.add("abc");
		AL.add("def");
		AL.add("pqr");
		
		//Sync list
		
		List<String> synclist=Collections.synchronizedList(AL);
		
		System.out.println(synclist);
		
		
		//note Iterator should be in synch block
		
		
		Iterator<String> itr =AL.iterator();
		
		synchronized(AL){
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		}
		
		//Method 2
		
		
		CopyOnWriteArrayList<String> arrlsit= new CopyOnWriteArrayList<>();
		
		arrlsit.add("abc");
		arrlsit.add("def");
		arrlsit.add("pqr");
		
		System.out.println(arrlsit);
		
		//Sync block not required for this method
		
		Iterator<String> iterator= arrlsit.iterator();
		
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
			
		}
	}

}
