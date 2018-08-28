package colletion.LinkedListDemo;

import java.util.LinkedList;

public class LinkedListMetods_get {
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> LL = new LinkedList<>();
		
		LL.add(10);
		LL.add(20);
		LL.add(30);
		LL.add(40);
		LL.add(50);
		LL.add(70);
		LL.add(80);
		
		LL.add(100);
		LL.add(200);
		LL.add(300);
		LL.add(400);
		LL.add(500);
		LL.add(700);
		LL.add(808);
		
		System.out.println(LL);
		
	System.out.println(LL.element());
	System.out.println(LL.peek());
	System.out.println(LL.peekFirst());
	System.out.println(LL.peekLast());
	System.out.println(LL.get(5));
	System.out.println(LL.getFirst());
	System.out.println(LL.getLast());
	
	System.out.println(LL);
	}

}
