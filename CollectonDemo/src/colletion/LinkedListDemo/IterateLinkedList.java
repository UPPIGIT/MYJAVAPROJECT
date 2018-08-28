package colletion.LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedList {

		public static void main(String[] args) {
			
			LinkedList<Integer> LL = new LinkedList<>();
			
		
			
			LL.add(10);
			LL.add(20);
			LL.add(30);
			LL.add(40);
			LL.add(50);
			LL.add(60);
			LL.add(30);
			LL.add(40);
			LL.add(null);
			LL.add(null);
			
		/*for loop*/
			for (int i = 0; i < LL.size(); i++) {
				
				System.out.println(LL.get(i));
				
			}
			
		/*Iterator*/	
			
			Iterator<Integer> itr =LL.iterator();
			
			while(itr.hasNext()){
				
				System.out.println(itr.next());
				
				
			}
			
		/*List Iterator*/	
			
			ListIterator<Integer> ltr=LL.listIterator();
			
			while(ltr.hasNext()){
				System.out.println(ltr.next());
				
				
			}
		/*List iterator*/
			
			ListIterator<Integer> ltr2=LL.listIterator(2);
			
			while(ltr2.hasNext())
			{
				System.out.println(ltr2.next());
				
			}
			
			System.out.println("========================================================");
					
		}
}
