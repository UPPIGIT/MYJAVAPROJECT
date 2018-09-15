package CollectionsPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsListMethod {
	
	public static void main(String[] args) {
		
		Integer a[]= {10,55,85,96,63};
		a[1]=500;
		
		for (Integer integer : a) {
			System.out.println(integer);
		}
		
		List<Integer> list= new ArrayList<>(Arrays.asList(a));
		
		
		System.out.println(list);
		list.add(855);
		list.add(6,788);
		System.out.println(list);
		list.remove(5);
		
		for (Integer integer : a) {
			System.out.println(integer);
		}
		
	}

}
