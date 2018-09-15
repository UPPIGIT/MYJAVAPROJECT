package CollectionsPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysDemo2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(10);
		al.add(105);
		al.add(109);
		al.add(103);
		al.add(101);
		al.add(104);
		al.add(88);
	//	al.add(null);
		
		System.out.println(al);
		
	Object obj[]=al.toArray();
	
	Integer intObj[] = new Integer[al.size()];
	
	for (int i = 0; i < obj.length; i++) {
		intObj[i]=(Integer) obj[i];
	}
	
	System.out.println(intObj);
	
	for (Integer integer : intObj) {
		System.out.println(integer);
	}
	
	Arrays.sort(intObj, new compr());
	
	for (Integer integer : intObj) {
		System.out.println(integer);
	}
	
	
	}

}


class compr implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}
