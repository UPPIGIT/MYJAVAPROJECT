package collection.ArrayListDemo;
import java.util.ArrayList;

public class ArrayListMethods2 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();//Now 'list' can hold 10 elements (Default Initial Capacity)
		
		al.ensureCapacity(20); //Now 'list' can hold 20 elements.
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		al.trimToSize();        //reducing the current capacity to current size of an ArrayList
		
	}
	
	 
		
}
