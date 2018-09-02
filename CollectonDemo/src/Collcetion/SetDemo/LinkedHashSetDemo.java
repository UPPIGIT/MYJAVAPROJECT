package Collcetion.SetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		
		As you already know, LinkedHashSet is an ordered version of HashSet. That means, HashSet doesn’t maintain any order 
		where as LinkedHashSet maintains insertion order of the elements.
		LinkedHashSet uses doubly linked list internally to maintain the insertion order of it’s elements. methods and constructors same has hashset*/
		
		LinkedHashSet<String> lhs= new LinkedHashSet<>();
		
		for (int i = 0; i < 11; i++) {
			
			lhs.add("H"+i);
			
		}
		
		System.out.println(lhs);
		
	}

}


/*[H0, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10]*/