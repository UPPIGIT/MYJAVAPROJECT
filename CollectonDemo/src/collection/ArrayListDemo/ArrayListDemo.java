package collection.ArrayListDemo;
import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList al= new ArrayList<>();
		
		ArrayList al1 =new ArrayList<>();
		al1.add(25);
		al1.add(45);
		al1.add(100);
		
		ArrayList al2 =new ArrayList<>();
		al2.add(250);
		al2.add(450);
		al2.add(1000);
		
		al.add(10);
		al.add("abc");
		al.add(null);     	// null allowed to Arraylist
		al.add('A');
		al.add(10);			//dublicate element allowed to arraylist
		al.add(5,20);
		System.out.println(al);
		
		al.addAll(al1);
		System.out.println(al);
		
		al.addAll(3, al2);
		System.out.println(al);
		
		
		
		System.out.println(al.size());
		System.out.println(al.get(1));
		System.out.println(al.indexOf(10));
		System.out.println(al.lastIndexOf(10));
		System.out.println(al.lastIndexOf("abc"));
		System.out.println(al.lastIndexOf("2"));
		
		
		//System.out.println(al.get(10));
		
		//al.add(7, "xyz"); //Insertion order preserved
		
		/*Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
	at java.util.ArrayList.rangeCheckForAdd(Unknown Source)
	at java.util.ArrayList.add(Unknown Source)
	at ArrayListDemo.main(ArrayListDemo.java:20)*/
	
		
		
	}

}
