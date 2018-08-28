package collection.ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
	 public static void main(String[] args) {
		

			ArrayList<String> strlist= new ArrayList<>();
			strlist.add("Donkey");
			strlist.add("Cat");
			strlist.add("Elephant");
			strlist.add("pig");
			
			System.out.println("Before Sorting :"+strlist);
			
			Collections.sort(strlist);
			
			System.out.println("After Sorting :"+strlist);
			
			ArrayList<Integer> intlist =new ArrayList<>();
			intlist.add(25);
			intlist.add(10);
			intlist.add(5);
			intlist.add(7);
			
			System.out.println("before sorting :" + intlist);
			
			Collections.sort(intlist);
			
			System.out.println("After  sorting :" + intlist);
			
			
			Collections.reverse(intlist);
			
			System.out.println("reverse order :"+intlist);
			
			Collections.sort(strlist,Collections.reverseOrder());
			
			System.out.println("reverse order :"+strlist);
			
	}
	
	

}

/*After Sorting :[Cat, Donkey, Elephant, pig]
before sorting :[25, 10, 5, 7]
After  sorting :[5, 7, 10, 25]
reverse order :[25, 10, 7, 5]
reverse order :[pig, Elephant, Donkey, Cat]*/
