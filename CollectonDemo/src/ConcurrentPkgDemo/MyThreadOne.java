package ConcurrentPkgDemo;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThreadOne extends Thread {
	
	static CopyOnWriteArrayList<Integer> cowal=new CopyOnWriteArrayList<>();
	
	@Override
	public void run() {
		
		System.out.println("chaild Thread started");
	
		cowal.add(500);
		cowal.add(600);
		System.out.println("chaild Thread ended");
	}

	public static void main(String[] args) throws InterruptedException {
		
		MyThreadOne t= new MyThreadOne();
		cowal.add(100);
		cowal.add(200);
		cowal.add(300);
		t.start();
		Iterator<Integer> itr=cowal.iterator();
		
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			//itr.remove();java.lang.UnsupportedOperationException
			
			cowal.set(2, 9999);
			
			if (integer==300) {
				cowal.add(456);
			}
			
			System.out.println("main thread iterating and current object is :"+integer);
			
			
			
		}
		
		System.out.println("main thread ended");
		System.out.println(cowal);
	}

}
