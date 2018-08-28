package colletion.LinkedListDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayToLinkedList {
	
	public static void main(String[] args) {
		
		//1.
		
		LinkedList<Integer> llist=new LinkedList<>(Arrays.asList(111,222,333,444,888));
		System.out.println(llist);
		
		//2.
		
		Integer[] array = new Integer[] {55,66,77};
		Collections.addAll(llist,array );
		System.out.println(llist);
		
		//3.
		
		llist.addAll(Arrays.asList(11,22,33));
		System.out.println(llist);
		
		
	}

}

/*[111, 222, 333, 444, 888]
[111, 222, 333, 444, 888, 55, 66, 77]
[111, 222, 333, 444, 888, 55, 66, 77, 11, 22, 33]*/