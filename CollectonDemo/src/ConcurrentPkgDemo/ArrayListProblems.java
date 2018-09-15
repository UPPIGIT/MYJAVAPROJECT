package ConcurrentPkgDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("=================***1****============");
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i = 101; i < 110; i++) {
			
			al.add(i);
			
		}
		
		System.out.println(al);//[101, 102, 103, 104, 105, 106, 107, 108, 109]
		
		//Note : even inside synchronized block also we can't add objects to synchronized Arraylist
		
	/*	synchronized (al) {
			
			Iterator<Integer> itr = al.iterator();
			
			//al.add(110);//java.util.ConcurrentModificationException  note : after iteration creation we can not add elements to list
			
			while (itr.hasNext()) {
				Integer integer = (Integer) itr.next();
				
				System.out.println(integer);
			}
			
		}*/
		
		Iterator<Integer> itr = al.iterator();
		
		//al.add(110);java.util.ConcurrentModificationException  note : after iteration creation we can not add elements to list
		
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
		//	al.add(88888);java.util.ConcurrentModificationException
			al.set(6, 66666);
		//	al.remove(2);java.util.ConcurrentModificationException
			System.out.println(integer);
		}
		
		System.out.println("=================***2****============");
		List<Integer> synclist= Collections.synchronizedList(al);
		
		System.out.println(synclist);
		
		
	/*	Iterator<Integer> iterator= synclist.iterator(); 
		//synclist.add(110); java.util.ConcurrentModificationException  note : after iteration creation we can not add elements to sync list also
		
		
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			
			System.out.println(integer);
			
		}*/
		
		//Note : even inside synchronized block also we can't add objects to Arraylist
		synchronized (synclist) {
			
			Iterator<Integer> iterator= synclist.iterator(); 
		//	synclist.add(110); //java.util.ConcurrentModificationException  note : after iteration creation we can not add elements to sync list also
			
			
			while (iterator.hasNext()) {
				Integer integer = (Integer) iterator.next();
				//al.add(141414);java.util.ConcurrentModificationException
				al.set(3, 000000);
				//al.remove(2);//java.util.ConcurrentModificationException
				
				System.out.println(integer);
				
			}
			
		}
		
		System.out.println("=================***3****============");
		CopyOnWriteArrayList<Integer> cowal= new CopyOnWriteArrayList<>();
		
		for (int i = 1001; i < 1010; i++) {
			
			cowal.add(i);
			
		}
		
		System.out.println(cowal);
		
		//Note : while iterating cowal if we try to remove objects using iterartor remove() method it throw exception
		
		Iterator<Integer> itrr=cowal.iterator();
		cowal.add(1011);//it won't throw exception
		//itrr.remove();java.lang.UnsupportedOperationException
		
		while (itrr.hasNext()) {
			Integer integer = (Integer) itrr.next();
			
			if(integer==1003) {
			cowal.add(222222);
			}
			
			if (integer==1005) {
				cowal.add(5, 5555555);
			}
			
			cowal.set(1, 111111);
			if (integer==1002) {
				cowal.remove(2);
			}
			
			//itrr.remove();java.lang.UnsupportedOperationException
			System.out.println(integer);
			
		}
		
		System.out.println(cowal);
	}

}
