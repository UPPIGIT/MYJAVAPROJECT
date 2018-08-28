package collections.VectorDemo;

import java.util.Vector;

public class VectorCapacity {
	
	public static void main(String[] args) {
		
		/*or. If you don’t pass, capacity increment will be
		 *  treated as zero and capacity of the vector will be doubled whenever size exceeds capacity.*/
		
		Vector<Integer> vector = new Vector<>(3);
		
		vector.addElement(10);
		vector.add(20);
		vector.add(30);
		
		System.out.println(vector);
		
		System.out.println(vector.capacity());
		
		vector.add(50);
		System.out.println(vector);
		System.out.println(vector.capacity());
	}

}

/*
 * 	[10, 20, 30]
	3
	[10, 20, 30, 50]
	6
 * 
 * */
