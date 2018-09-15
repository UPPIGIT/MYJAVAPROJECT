package ConcurrentPkgDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		
		
		for (int i = 101; i < 110; i++) {
			al.add(i);
		}
		
		System.out.println(al);
		
		ListIterator<Integer> litr=al.listIterator();
		
		
	
	
	while (litr.hasNext()) {
		Integer integer = (Integer) litr.next();
		
		if (integer==101) {
			litr.add(11111);
			//litr.remove();java.lang.IllegalStateException
		
		}
		
		if (integer==102) {
			litr.set(77777);
			
		}
		
		if (integer==105) {
			litr.remove();
		}
	
		System.out.println(integer);
		
	}
	
	
	System.out.println(al);
	}

}
