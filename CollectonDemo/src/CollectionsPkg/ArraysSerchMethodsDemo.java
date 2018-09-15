package CollectionsPkg;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysSerchMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {20,5,2,8,6,14,78,25};
		
		System.out.println(Arrays.binarySearch(a, 8));
		System.out.println(Arrays.binarySearch(a, 99));
		
		Integer i[]= {74,14,85,25,69,96,36,63};
		
		System.out.println("Binary search");
		
		System.out.println(Arrays.binarySearch(i, 69));
		System.out.println(Arrays.binarySearch(i, 223));
		
		System.out.println("before sort");
		for (Integer integer : i) {
			System.out.println(integer);
		}
		
		System.out.println("after sort");
		Arrays.sort(i);
		
		for (Integer integer : i) {
			System.out.println(integer);
		}
		
		System.out.println("Binary search");
		System.out.println(Arrays.binarySearch(i, 69));
		System.out.println(Arrays.binarySearch(i, 223));
		
		
		System.out.println("after sort as per comparatot");
		Arrays.sort(i,new MyCompr());
		
		for (Integer integer : i) {
			System.out.println(integer);
		}
		
		System.out.println("Binary search");
		System.out.println(Arrays.binarySearch(i, 69));
		System.out.println(Arrays.binarySearch(i, 223));

	}

}

class MyCompr implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}