package collection.ArrayListDemo;
import java.util.ArrayList;

public class ArrayListMethods5 {

	 public static void main(String[] args) {
		 
		 ArrayList al = new ArrayList<>();
		 
		 al.add(1000);
		 al.add(10);
		 al.add(2000);
		 al.add(20);
		 al.add(3000);
		 al.add(30);
		 al.add(4000);
		 al.add(40);
		 
		 System.out.println(al);
		 
		 ArrayList al1= new ArrayList<>();
		 al1.add(10);
		 al1.add(20);
		 al1.add(30);
		 al1.add(40);
		 
		 al.retainAll(al1);

		 System.out.println(al);
	}
	
	
	
	
}

/*[1000, 10, 2000, 20, 3000, 30, 4000, 40]
[10, 20, 30, 40]
*/