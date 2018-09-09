package ConcurrentPkgDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class MyThread extends Thread{
	
	static ArrayList<String> al1 = new ArrayList<>();
	
	static List<String> al=Collections.synchronizedList(al1);
	
	
	
	@Override
	public void run() {
		
		try 
		{
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println("child thread updating list");
		
			al.add("D");
			
		System.out.println("child thread end");	
		
	}

		public static void main(String[] args) throws InterruptedException {
			al.add("A");
			al.add("B");
			al.add("C");
			
			MyThread t = new MyThread();
			t.start();
			
			
			synchronized(al)
			{

				Iterator<String> itr=al.iterator();
			
			while (itr.hasNext()) {
				String string = (String) itr.next();
				//al.add("abc");java.util.ConcurrentModificationException
				
				al.set(2, "XXX");
				
				System.out.println("Main thread iterating list and current object is and current object is :"+string);
				
				Thread.sleep(3000);
				
			}
			}
			
			System.out.println("main thread end");
			System.out.println(al);
		}
}
