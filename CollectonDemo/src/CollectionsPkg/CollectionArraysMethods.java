package CollectionsPkg;

import java.util.Arrays;
import java.util.Comparator;

public class CollectionArraysMethods {

	public static void main(String[] args) {
		
		int a[]= {10,5,12,9,15,22};
		
		System.out.println("Primitive array before sorting");
		
		for (int i : a) {
			System.out.println(i);
		}

		Arrays.sort(a);
		
		System.out.println("Primitive array after sorting");
		
		for (int i : a) {
			System.out.println(i);//natural sorting order
		}
		
		String str[]= {"zzz","aaa","bbb","yyy","pqr","lmn","123"};
		
		System.out.println("Objects before sorting");
		
		for (String string : str) {
			System.out.println(string);
		}
		
		System.out.println("Objects after sorting");
		
		Arrays.sort(str);
		
		for (String string : str) {
			System.out.println(string);//natural order
		}
		
		System.out.println("objects soring as per comparator");
		
		Arrays.sort(str,new comp());
		
		for (String string : str) {
			System.out.println(string);
		}
		

	}

}

class comp implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
