package collection.ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sublistException {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,52,56,89,78,55));
		
		System.out.println(al);
		
		List<Integer> sublist1=al.subList(0, 5);
		

		System.out.println(sublist1);
		
		/*List<Integer> sublist2=al.subList(0, 10);
		 * 
		 * Exception in thread "main" java.lang.IndexOutOfBoundsException: toIndex = 10
	at java.util.ArrayList.subListRangeCheck(Unknown Source)
	at java.util.ArrayList.subList(Unknown Source)
	at collection.ArrayListDemo.sublistException.main(sublistException.java:20)

		*/
		
	//	List<Integer> sublist2=al.subList(6, 2);
		
		/*Exception in thread "main" java.lang.IllegalArgumentException: fromIndex(6) > toIndex(2)
	at java.util.ArrayList.subListRangeCheck(Unknown Source)
	at java.util.ArrayList.subList(Unknown Source)
	at collection.ArrayListDemo.sublistException.main(sublistException.java:29)
*/
		
		
	}
}
