package ConcurrentPkgDemo;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteMethods {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> cowal= new CopyOnWriteArrayList<>();
		
		for (int i = 101; i < 110; i++) {
			
			cowal.add(i);
			
		}
		
		cowal.add(null);
		cowal.add(null);
		System.out.println(cowal);
		
		
		System.out.println(cowal.addIfAbsent(222));
		System.out.println(cowal.addIfAbsent(103));
		
		System.out.println(cowal);
		
		CopyOnWriteArrayList<Integer> al2= new CopyOnWriteArrayList<>();
		
		for (int i = 105; i < 115; i++) {
			
			al2.add(i);
			
		}
		
		System.out.println(al2);
		
	//	cowal.addAll(al2);
		
		//System.out.println(cowal); add all elements of al2 to cowal
		
		System.out.println(cowal.addAllAbsent(al2));
		
		System.out.println(cowal);
	}
}
