package collections.VectorDemo;

import java.util.Arrays;
import java.util.Vector;

public class VectorClassMethods {
	
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>();
		
		//add elements to vector
		
		vector.add(10);
		vector.add(20);
		vector.add(30);
		
		System.out.println(vector);
		
		vector.add(1,15);
		vector.add(3,25);
		
		System.out.println(vector);
		
		//vector.add(8, 35); // java.lang.ArrayIndexOutOfBoundsException:
		
		vector.addAll(vector);
		vector.addAll(2, vector);
		
		System.out.println(vector);
		
		//vector specific methods
		
		vector.addElement(888);
		vector.addElement(999);
		
		System.out.println(vector);
		
		/*[10, 20, 30]
[10, 15, 20, 25, 30]
[10, 15, 10, 15, 20, 25, 30, 10, 15, 20, 25, 30, 20, 25, 30, 10, 15, 20, 25, 30]
[10, 15, 10, 15, 20, 25, 30, 10, 15, 20, 25, 30, 20, 25, 30, 10, 15, 20, 25, 30, 888, 999]

*/
		
		/****** retrive elements ***/
		
		System.out.println(vector.get(5));
		System.out.println(vector.elementAt(10));
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		
		
		/*****remove eleemnts**/
		
		vector.removeElementAt(5);
		vector.remove(10);
		vector.remove((Integer)15);
		vector.remove((Integer)963);
		vector.removeAll(Arrays.asList(10,20,30,745,695,null));
		System.out.println(vector);
		
		vector.removeAll(vector);
		System.out.println(vector);
		
		
	}

}
