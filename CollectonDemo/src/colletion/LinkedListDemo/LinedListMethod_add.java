package colletion.LinkedListDemo;

import java.util.LinkedList;

public class LinedListMethod_add {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> LL = new LinkedList<>();
		
		LL.add(10);
		LL.add(20);
		LL.add(30);
		
		System.out.println(LL);
		
		LL.add(3, 40);
		LL.add(4, 70);
		
		System.out.println(LL);
		
		
		LinkedList<Integer> LL1 = new LinkedList<>();
		
		LL1.add(100);
		LL1.add(200);
		LL1.add(300);
		
		LL.addAll(LL1);
		

		System.out.println(LL);
		
		LL.addAll(0, LL1);
		System.out.println(LL);
		
		LL.addFirst(0);
		System.out.println(LL);
		
		
		LL.addLast(9999);
		System.out.println(LL);
		
		LL.offer(888);
		System.out.println(LL);
		
		LL.offerFirst(5555);
		System.out.println(LL);
		
		LL.offerLast(4444);
		System.out.println(LL);
		
	}

}
