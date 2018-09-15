package ConcurrentPkgDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ThreadOne extends Thread {
	
	//static ArrayList<Integer> al = new ArrayList<>();//Non Thread safe -data in consistency problem
	static	ArrayList<Integer> al1 = new ArrayList<>();
	static List<Integer> al=Collections.synchronizedList(al1);
	
	
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		
		for (int i = 101; i < 300; i++) {
			
			al.add(i);
			
		}
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		ThreadOne t1 = new ThreadOne();
		ThreadOne t2= new ThreadOne();
		ThreadOne t3 = new ThreadOne();
		ThreadOne t4= new ThreadOne();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		for (int i = 201; i < 205; i++) {
			al.add(i);
			
		}
		Thread.sleep(2000);
	
	Iterator<Integer> itr=al.iterator();
	
	synchronized (al) {
		
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			
			System.out.println(integer);
			
			
			
		}
		
	}
	
	
		
		
		System.out.println(al);
		System.out.println(al.size());

	}

}
