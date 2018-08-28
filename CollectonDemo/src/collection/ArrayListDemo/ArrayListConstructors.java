package collection.ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListConstructors {

		public static void main(String[] args) {
			
			//method -1
			ArrayList<String> Al1 = new ArrayList<>(); // with default capacity 10
			Al1.add("abc");
			Al1.add("XYZ");
			

			System.out.println(Al1);
			
			//Method 2
			ArrayList<String> AL2 = new ArrayList<>(20); // with capacity 20
			

			System.out.println(AL2);
			//Method 3
			
			ArrayList<String> AL3 = new ArrayList<>(Al1);
			
			System.out.println(AL3);
			
			//Other ways to create ArrayList --Arrays.aslist();
			
			ArrayList<String> AL4 = new ArrayList<>(Arrays.asList("UPPI","LMN","POTTI"));
			
			System.out.println(AL4);
			
			Integer[] array= new Integer[]{10,20,30,70};
			
			ArrayList<Integer> AL5 = new ArrayList<>(Arrays.asList(array));
			
			System.out.println(AL5);
			
			//Collection.nCopies();
			
			ArrayList<Integer> AL6 = new ArrayList<>(Collections.nCopies(10, 5));
			
			System.out.println(AL6);
			
			
			
	
			}
			
		}
	
	
/*[abc, XYZ]
[]
[abc, XYZ]
[UPPI, LMN, POTTI]
[10, 20, 30, 70]
[5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
*/


