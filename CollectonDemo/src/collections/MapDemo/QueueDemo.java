package collections.MapDemo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		pq.add(77);
		pq.add(22);
		pq.add(55);
		pq.add(99);
		pq.add(66);
		pq.add(44);
		pq.add(33);
		pq.add(99);
		pq.add(66);
		//pq.add(null);//NPE
		
		System.out.println(pq);
		
		PriorityQueue<Integer> pq1= new PriorityQueue<>();
		pq1.offer(77);
		pq1.offer(22);
		pq1.offer(55);
		pq1.offer(99);
		pq1.offer(66);
		pq1.offer(44);
		pq1.offer(33);
		pq1.offer(99);
		pq1.offer(66);
		
		System.out.println(pq1);
		
		/*System.out.println(pq1.peek());
		System.out.println(pq1.peek());
		System.out.println(pq1.peek());*/
		
		System.out.println(pq1.poll());
		System.out.println(pq1.poll());
		System.out.println(pq1.poll());
		System.out.println(pq1.poll());
		System.out.println(pq1.poll());
		System.out.println(pq1.poll());
		System.out.println(pq1.poll());
		System.out.println(pq1.poll());
		System.out.println(pq1.poll());
		System.out.println(pq1.poll());
		//System.out.println(pq1.element()); java.util.NoSuchElementException
		
		System.out.println(pq1);
		
		PriorityQueue<Integer> pq2= new PriorityQueue<>(new Mycomartor());
		
		pq2.offer(77);
		pq2.offer(22);
		pq2.offer(55);
		pq2.offer(99);
		pq2.offer(66);
		pq2.offer(44);
		pq2.offer(33);
		pq2.offer(99);
		pq2.offer(66);
		
		System.out.println(pq2);
		
		/*System.out.println(pq1.peek());
		System.out.println(pq1.peek());
		System.out.println(pq1.peek());*/
		
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
	}

}

class Mycomartor implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
