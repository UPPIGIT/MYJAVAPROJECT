package colletion.LinkedListDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedlist = new LinkedList<>();
		
		linkedlist.add(111);
		linkedlist.add(222);
		linkedlist.add(333);
		linkedlist.add(444);
		
		ArrayList<Integer> arrList = new ArrayList<>(linkedlist);
		
		for (Integer integer : arrList) {
			System.out.println(integer);
			
		}
	}

}


/*111
222
333
444*/