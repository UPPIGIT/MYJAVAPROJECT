package collection.ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>(Arrays.asList("uppi","potti","abc","lmn"));
		
		/*Normal for loop*/
		
		System.out.println("Normal for loop");
		for (int i = 0; i < al.size(); i++) {
			
			System.out.println(al.get(i));
			
		}
		
		/*Iterator*/
		System.out.println("Using iterator");
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext()) {
				
			System.out.println(itr.next());
			
		/*	al.add("PQR");Exception in thread "main" java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at collection.ArrayListDemo.ArrayListIteration.main(ArrayListIteration.java:29)
*/
		}
		
		/*ListIterator*/
		System.out.println("Using List iterator forward direction");
		
		ListIterator<String> litr=al.listIterator();
		
		while(litr.hasNext()){
			
			System.out.println(litr.next());
			
			al.add("test");
			
			/*Exception in thread "main" java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at collection.ArrayListDemo.ArrayListIteration.main(ArrayListIteration.java:45)
*/
			
		}
		
		/*ListIterator*/
		System.out.println("Using List iterator reverse direction");
		
		while(litr.hasPrevious())
		{
			
			System.out.println(litr.previous());
		}
		
		/*enhanced for loop*/
		
		System.out.println("Enhanced for loop");
		
		for (String string : al) {
			
			System.out.println(string);
		}
	}

}
