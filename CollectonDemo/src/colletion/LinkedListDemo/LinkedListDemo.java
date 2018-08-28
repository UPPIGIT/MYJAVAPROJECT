package colletion.LinkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> LL = new LinkedList<>();
		
		LL.add(10);
		LL.add(20);
		LL.add(30);
		LL.add(10);//can insert dublicate elements
		LL.add(20);
		LL.add(null); //any no of null inserted
		LL.add(null);
		
		System.out.println(LL);
		
		
	}
	
}
