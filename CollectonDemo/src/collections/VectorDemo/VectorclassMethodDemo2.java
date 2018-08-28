package collections.VectorDemo;

import java.util.Arrays;
import java.util.Vector;

public class VectorclassMethodDemo2 {
	
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>();
		
		//add elements to vector
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(1,15);
		vector.add(3,25);
		//vector.add(8, 35); // java.lang.ArrayIndexOutOfBoundsException:
		vector.addAll(vector);
		vector.addAll(2, vector);
		//vector specific methods
		vector.addElement(888);
		vector.addElement(999);
		
		System.out.println(vector);
		
		Integer[] intaray = new Integer[25];
		vector.copyInto(intaray);
		
		System.out.println(vector.contains(888));
		System.out.println(vector.contains(444));
		
		System.out.println(vector.isEmpty());
		System.out.println(vector.containsAll(Arrays.asList(10,15,20,25)));
		System.out.println(vector.indexOf(888));
		System.out.println(vector.lastIndexOf(888));
		System.out.println(vector.lastElement());
		System.out.println(vector.subList(10, 20));
		System.out.println(vector.retainAll(Arrays.asList(10,15,20,25)));
	}

}
