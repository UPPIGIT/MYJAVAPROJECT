package ConcurrentPkgDemo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CopyOnWriteSet {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set= new HashSet<>();
		
		set.add(101);
		set.add(102);
		set.add(103);
		
		Iterator<Integer> itr= set.iterator();
		//set.add(104);//java.util.ConcurrentModificationException
		
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			System.out.println(integer);
		}
		
		Set<Integer> syncSet=Collections.synchronizedSet(set);
		
	/*	Iterator<Integer> iterator=syncSet.iterator();
		//set.add(104);ConcurrentModificationException
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			
			System.out.println(integer);
			
		}*/
		
		synchronized (syncSet) {
			
			Iterator<Integer> iterator=syncSet.iterator();
		//	set.add(104);//ConcurrentModificationException
			while (iterator.hasNext()) {
				Integer integer = (Integer) iterator.next();
				
				System.out.println(integer);
				
			}
			
		}
	}

}
