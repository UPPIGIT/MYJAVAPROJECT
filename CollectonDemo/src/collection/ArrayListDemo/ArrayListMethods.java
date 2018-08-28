package collection.ArrayListDemo;
import java.util.ArrayList;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		

		ArrayList al = new ArrayList<>();
		
		System.out.println(al.size());//0
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al.size());//4
		
		al.remove(3);
		
		System.out.println(al.size());//3
		
		al.add(20);
		al.add(30);
		al.add(null);
		al.add(null);
		
		System.out.println(al); //		[10, 20, 30, 20, 30, null, null]
		
		al.add(2, 100);
		al.add(5, 500);
		
		System.out.println(al); //[10, 20, 100, 30, 20, 500, 30, null, null]
		
		ArrayList al1 = new ArrayList<>();
		
		al1.add(111);
		al1.add(222);
		al1.add(333);
		
		
		al.addAll(al1);
		System.out.println(al); //[10, 20, 100, 30, 20, 500, 30, null, null, 111, 222, 333]
		
		al.addAll(2, al1);
		System.out.println(al);//[10, 20, 111, 222, 333, 100, 30, 20, 500, 30, null, null, 111, 222, 333]
		
	}
	
	
	

}
