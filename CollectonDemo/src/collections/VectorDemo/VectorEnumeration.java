package collections.VectorDemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumeration {
	
	/*You can traverse the vector using Enumeration object. 
	 * Vector class has a method called elements() which returns an Enumeration object consisting of all elements of Vector.*/
	
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>();
		vector.addElement(10);
		vector.addElement(20);
		vector.add(30);
		vector.add(1, 15);
		vector.addAll(vector);
		vector.addAll(2,vector);
		
		Enumeration<Integer> enumeration = vector.elements();
		
		while(enumeration.hasMoreElements()) {
			
			System.out.println(enumeration.nextElement());
		}
		
	}

}

/*10
15
10
15
20
30
10
15
20
30
20
30
10
15
20
30*/