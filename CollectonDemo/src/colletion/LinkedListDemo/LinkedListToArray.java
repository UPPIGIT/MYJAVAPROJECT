package colletion.LinkedListDemo;

import java.util.LinkedList;

public class LinkedListToArray {
	
	public static void main(String[] args) {
		
		LinkedList<String> stringlsit = new LinkedList<>();
		
		stringlsit.add("abc");
		stringlsit.add("XYZ");
		stringlsit.add("pqr");
		stringlsit.add("ADF");
		
	String[] strArray=stringlsit.toArray(new String[stringlsit.size()]);
	
	for (String string : strArray) {
		
		System.out.println(string);
	}
	}

}

/*abc
XYZ
pqr
ADF*/


/*In the above example we have taken a LinkedList of Strings, however if you have a LinkedList of different type then you can just change the conversion logic like this.

For LinkedList conversion logic would be:
Double[] array = linkedlist.toArray(new Double[linkedlist.size()]);

Similarly for LinkedList conversion logic would be:
Integer[] array = linkedlist.toArray(new Integer[linkedlist.size()]);

More about toArray() method from Javadoc:

public T[] toArray(T[] a): It returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array. If the list fits in the specified array, it is returned therein. Otherwise, a new array is allocated with the runtime type of the specified array and the size of this list.

If the list fits in the specified array with room to spare (i.e., the array has more elements than the list), the element in the array immediately following the end of the list is set to null. (This is useful in determining the length of the list only if the caller knows that the list does not contain any null elements.)*/