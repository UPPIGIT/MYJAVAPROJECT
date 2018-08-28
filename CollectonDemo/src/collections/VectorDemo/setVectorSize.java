package collections.VectorDemo;

import java.util.Vector;

public class setVectorSize {
	
	public static void main(String[] args) {
		
		/*Unlike an ArrayList, you can set the size of the Vector manually.
		 *  If the new size is greater than the current size, the new slots will be filled with null elements. 
		 * If the new size is smaller than current size, then the extra elements will be discarded.*/
		
		Vector<Integer> vector = new Vector<>();
		
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		
		System.out.println(vector);
		
		vector.setSize(10);
		
		System.out.println(vector);
		
		vector.setSize(3);
		
		System.out.println(vector);
		
		
		
	}

}

/*
 * [10, 20, 30, 40, 50]
	[10, 20, 30, 40, 50, null, null, null, null, null]
	[10, 20, 30]

 * 
 * /
 */