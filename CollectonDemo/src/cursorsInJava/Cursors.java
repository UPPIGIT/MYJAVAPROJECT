package cursorsInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Cursors {
	
	public static void main(String[] args) {
		
		/*3 cursors in java
		 * 1. Enumeration
		 * 2. Iterator
		 * 3.ListIterator*/
		
		/*Enumeration*/
		
		Vector<Integer> vector= new Vector<>();
		vector.add(77);
		vector.add(88);
		vector.add(44);
		vector.add(777);
		vector.add(888);
		vector.add(444);
		
		System.out.println("Vector iteration using enumeration");
		Enumeration<Integer> e= vector.elements(); //vector class elements() method returns enumeration object
		
		while(e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
			
		}
		
		ArrayList<Integer> al= new ArrayList<>(Arrays.asList(11,22,33,44,55,66,77,88));
		
		Iterator<Integer> itr= al.iterator();
		
		System.out.println("ArrayList iteration usingIterator");
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println("Arraylist forward itearion usinglistIterator");
		ListIterator<Integer> ltr=al.listIterator();
		
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
			
			
		}
		
		System.out.println("Arraylist backward itearion usinglistIterator");
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
			
		}
		
		System.out.println("LinkedList iteration usingIterator");
		LinkedList<Integer> ll= new LinkedList<>(Arrays.asList(111,222,333,444,555,666,777,888,999));
		
		Iterator<Integer> iterator=ll.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			
		}
		System.out.println("LinkedList forward itearion usinglistIterator");
		ListIterator<Integer> listIterator=ll.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("Arraylist backward itearion usinglistIterator");
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		
		
	}

}
