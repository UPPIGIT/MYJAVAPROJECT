package collections.VectorDemo;

import java.util.Vector;

public class VectorClassConstructors {

		public static void main(String[] args) {
			
			//1.
			
			Vector<Integer> vector = new Vector<>();
			System.out.println(vector.capacity());
			
			//2.
			
			Vector<Integer> vector1 = new Vector<>(25);
			
			System.out.println(vector1.capacity());
			
			//3
			
			Vector<Integer> vector3 = new Vector<>(25,10);
			System.out.println(vector3.capacity());
			
			//4
			
			Vector<Integer> vector4= new Vector<>(vector1);
			System.out.println(vector4.capacity());
			
			
			
		}
}

/*10
25
25
0*/