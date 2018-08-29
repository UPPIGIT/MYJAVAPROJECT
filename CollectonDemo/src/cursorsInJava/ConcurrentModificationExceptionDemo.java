package cursorsInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ConcurrentModificationExceptionDemo {
	
	public static void main(String[] args) {
		
		Integer[] intarr= {77,44,11,88,55,22,99};
		Vector<Integer> vector= new Vector<>(Arrays.asList(intarr));
		
		Enumeration<Integer> e = vector.elements();
		
		while (e.hasMoreElements()) {
			
			
			if (e.nextElement()==88) {
				vector.addElement(888);
				vector.add(999);//Note : enumeration won't throw concurent modification exception
				
				System.out.println(vector);
				
				
			}
			
		
		}
		
		System.out.println(vector);	
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(intarr));
		
		Iterator<Integer> itr =al.iterator();
		
		while (itr.hasNext()) {
			
			
			
			
			if (itr.next()==11) {
				
				/*al.add(1111);				Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
	at cursorsInJava.ConcurrentModificationExceptionDemo.main(ConcurrentModificationExceptionDemo.java:42)
	
	
*/
				
				itr.remove();//we can remove element using remove() method of iterator
				
				
				
			}
			
		}
			System.out.println(al);
			
			
			ListIterator<Integer> ltr=al.listIterator();
			
			while (ltr.hasNext()) {
				
				if (ltr.next()==99) {
					
					/*al.add(666);/*Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
	at cursorsInJava.ConcurrentModificationExceptionDemo.main(ConcurrentModificationExceptionDemo.java:69)
	
	*/
					ltr.add(444);
					ltr.add(222);
				/*	ltr.remove();    Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
	at cursorsInJava.ConcurrentModificationExceptionDemo.main(ConcurrentModificationExceptionDemo.java:69)
*/
					
				}
			
				
				System.out.println(al);
				
				
				LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(intarr));
				
				Iterator<Integer> iterator=ll.iterator();
				
				while (iterator.hasNext()) {
					Integer integer = (Integer) iterator.next();
					
					if (integer==22) {
						iterator.remove();
						
					} 
					
				}
				
				System.out.println(ll);
				
				ListIterator<Integer> litr=ll.listIterator();
				while (litr.hasNext()) {
					Integer integer = (Integer) litr.next();
					
					if (integer==11) {
						litr.add(222);
						
					} else {
						litr.remove();
					}
					
				}
				System.out.println(ll);
				
			}
			
			
	}

}
