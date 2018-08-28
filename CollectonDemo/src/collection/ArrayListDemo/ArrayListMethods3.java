package collection.ArrayListDemo;
import java.util.ArrayList;

public class ArrayListMethods3 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		
		System.out.println(al.isEmpty());//true
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al.isEmpty()); //false
		
		System.out.println(al.contains(30));//true
		
		System.out.println(al.contains(300)); //false
		
		al.add("hello");
		al.add("world");
		al.add("hi");
		al.add("india");
		al.add("hello");
		al.add("india");
		
		System.out.println(al); //[10, 20, 30, hello, world, hi, india, hello, india]
		
		System.out.println(al.indexOf("hello")); //3
		System.out.println(al.lastIndexOf("hello"));//7
		System.out.println(al.indexOf(1000));//-1
		System.out.println(al.lastIndexOf(1000));//-1
		
		
		System.out.println(al.get(1));
		//System.out.println(al.get(20));
		
		System.out.println(al);//[10, 20, 30, hello, world, hi, india, hello, india]
		al.set(0, "SRUTHI");
		System.out.println(al);//[SRUTHI, 20, 30, hello, world, hi, india, hello, india]
		
		al.remove(4);
		System.out.println(al.remove(new Integer(30)));
		System.out.println("hello");//Remove first occurence		[SRUTHI, 20, hello, hi, india, hello, india]
		System.out.println(al);
		
		//Convert an ArrayList to Array
		
		ArrayList al1 = new ArrayList<>();
		
		al1.add("UPPI");
		al1.add("abc");
		al1.add("tadewar");
		
		Object[] str =al1.toArray();
		
		for (Object object : str) {
				System.out.println(object);
		}
		
		
		
		
		
	}

}
