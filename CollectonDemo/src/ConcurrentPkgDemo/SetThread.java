package ConcurrentPkgDemo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetThread extends Thread {
	
	/*static HashSet<Integer> hs1 = new HashSet<>();//java.util.ConcurrentModificationException and data inconsistency problem
	
	static Set<Integer> hs=Collections.synchronizedSet(hs1);//won't get data inconsistency isssue but we get  ConcurrentModificationException
	
	*/
	
static	CopyOnWriteArraySet<Integer> hs= new CopyOnWriteArraySet<>();
	
	@Override
	public void run() {
		
	for (int i = 1000; i < 2000; i++) {
			
			hs.add(i);
			
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		SetThread t1= new SetThread();
		t1.start();
		
		for (int i = 100; i < 500; i++) {
			
			hs.add(i);
			
		}
		
	
		
		Iterator<Integer> itr= hs.iterator();
		
		
		
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			
			System.out.println(integer);
			
		}

			Thread.sleep(2000);
			System.out.println(hs);
			System.out.println(hs.size());
	}

}
