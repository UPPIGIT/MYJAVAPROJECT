package colletion.LinkedListDemo;

import java.util.LinkedList;

public class LinkedListMethod_remove {
	
	public static void main(String[] args) {
	LinkedList<Integer> LL = new LinkedList<>();
		
		LL.add(10);
		LL.add(20);
		LL.add(30);
		LL.add(40);
		LL.add(50);
		LL.add(70);
		LL.add(80);
		
		LL.add(10);
		LL.add(20);
		LL.add(30);
		LL.add(40);
		LL.add(50);
		LL.add(70);
		LL.add(80);
		
		System.out.println(LL);
		
		LL.poll();
		System.out.println(LL);
		
		LL.pollFirst();
		System.out.println(LL);
		
		LL.pollLast();
		System.out.println(LL);
		
		LL.remove();
		System.out.println(LL);
		
		LL.removeFirst();
		System.out.println(LL);
		
		LL.removeLast();
		System.out.println(LL);
		
		
		LL.remove(2);
		System.out.println(LL);
		
		LL.removeFirstOccurrence(50);
		System.out.println(LL);
		
		LL.removeLastOccurrence(50);
		System.out.println(LL);
		
		LL.remove((Integer)30);
		System.out.println(LL);
	
		
		
		
	}

}
