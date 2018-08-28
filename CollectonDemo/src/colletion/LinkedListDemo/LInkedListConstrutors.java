package colletion.LinkedListDemo;

import java.util.LinkedList;

public class LInkedListConstrutors {
	
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
		
		System.out.println(LL);
		
		LinkedList<Integer> LL2 =new LinkedList<>(LL);
		
		System.out.println(LL2);
	}

}
