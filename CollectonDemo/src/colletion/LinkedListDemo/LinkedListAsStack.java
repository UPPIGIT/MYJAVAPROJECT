package colletion.LinkedListDemo;

import java.util.LinkedList;

public class LinkedListAsStack {
	
	public static void main(String[] args) {
		
		/*last in first out*/
		LinkedList<Integer> stack = new LinkedList<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	//	System.out.println(stack.pop());
	//	System.out.println(stack.pop());
		
		/*java.util.NoSuchElementException
	at java.util.LinkedList.removeFirst(Unknown Source)
	at java.util.LinkedList.pop(Unknown Source)
	at colletion.LinkedListDemo.LinkedListAsStack.main(LinkedListAsStack.java:31)
*/
		System.out.println(stack);
	}

}


/*[80, 70, 60, 50, 40, 30, 20, 10]
80
70
60
50
40
30
20
10
*/