package Collcetion.SetDemo;

import java.util.HashSet;

public class HashSetConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.with default=t capacity 16
		
		HashSet<Integer> hs = new HashSet<>();
		
		//2.with capacity 25 and load factor 75
		HashSet<Integer> hs1= new HashSet<>(25);
		
		//3.capacity 25 and load factor 0.5f
		
		HashSet<Integer> hs2 = new HashSet<>(25, 0.5f);
		
		//4. creates  hashset using given collection
		
		HashSet<Integer> hs3 = new HashSet<>(hs1);
		

	}

}
