package collection.ArrayListDemo;
import java.util.ArrayList;

//Array to array list example2

public class ArrayListMethods11 {
	
	public static void main(String[] args) {
		
		Integer[] array = new Integer[15];
		
		ArrayList<Integer> al =new ArrayList<>();
		al.add(10);
		al.add(100);
		al.add(30);
		al.add(200);
		
		
		array=al.toArray(array);
		
		for (Integer integer : al) {
			
			System.out.println(integer);
			
		}
		
		System.out.println("length :" +array.length);
		
		
		Integer[] array2 = new Integer[2];
		
		ArrayList<Integer> al2 =new ArrayList<>();
		al2.add(10);
		al2.add(100);
		al2.add(30);
		al2.add(200);	
		
		array2 =al.toArray(array2);
		
		for (Integer integer : al2	) {
			
			System.out.println(integer);
			
		}
		
		System.out.println("length :" +array2.length);
	}
}
