package colletion.LinkedListDemo;

import java.util.LinkedList;

public class LinkedListAsQueue {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		queue.offer(60);
		queue.offer(70);
		queue.offer(80);
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
	}

}


/*[10, 20, 30, 40, 50, 60, 70, 80]
10
20
30
40
50
60
70
80
null
[]
*/