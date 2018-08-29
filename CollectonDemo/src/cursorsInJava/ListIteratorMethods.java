package cursorsInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListIteratorMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(11,22,33));
		
		ListIterator<Integer> ltr=al.listIterator(al.size());
		
			while (ltr.hasPrevious()) {
			
			
			
			System.out.println(ltr.hasPrevious());
			System.out.println(ltr.hasNext());
			System.out.println(ltr.nextIndex());
			System.out.println(ltr.previousIndex());
			
			
			System.out.println("=================================");
			
			Integer integer = (Integer) ltr.previous();
			
			
			
		}
		
		while (ltr.hasNext()) {
			
			
			
			System.out.println(ltr.hasPrevious());
			System.out.println(ltr.hasNext());
			System.out.println(ltr.nextIndex());
			System.out.println(ltr.previousIndex());
			
			
			System.out.println("=================================");
			Integer integer = (Integer) ltr.next();
			
			
		}
		
		
	
		
	System.out.println("**********************************************************");
	
	

	
	/*		while (ltr.hasNext()) {
				Integer integer = (Integer) ltr.previous();  
				Exception in thread "main" java.util.NoSuchElementException
	at java.base/java.util.ArrayList$ListItr.previous(Unknown Source)
	at cursorsInJava.ListIteratorMethods.main(ListIteratorMethods.java:51)

				
			}*/
	
	System.out.println(ltr.hasNext());
	System.out.println(ltr.hasPrevious());
			
		/*	while (ltr.hasPrevious()) {
				Integer integer = (Integer) ltr.next();
				System.out.println(integer);
				
				Exception in thread "main" java.util.NoSuchElementException
	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
	at cursorsInJava.ListIteratorMethods.main(ListIteratorMethods.java:70)

			}*/
	}
	
	
	
}
