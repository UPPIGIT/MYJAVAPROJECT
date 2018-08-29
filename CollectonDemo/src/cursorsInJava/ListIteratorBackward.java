package cursorsInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListIteratorBackward {
	
	public static void main(String[] args) {
	
		/*Note : 
1
down vote
Since you get the default ListIterator for the list, it starts with the first element, which is why hasPrevious() returns false and the while loop is exited. If you want to traverse the list in the reverse order, get the ListIterator from the last index and traverse backwards using the hasPrevious() and previous() methods.

ListIterator<String> i = a.listIterator(a.size()); // Get the list iterator from the last index
while (i.hasPrevious()) {
    System.out.println(i.previous());
}*/
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		
		ListIterator ltr =al.listIterator(al.size());
		
	
		
		
		
		while (ltr.hasPrevious()) {
			System.out.println(ltr.previous());
			
		}

		
	}

}
