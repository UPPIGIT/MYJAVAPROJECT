package collection.ArrayListDemo;
import java.util.ArrayList;

public class ArrayListMethods7 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> AL = new ArrayList<>();
		
		AL.add(10);
		AL.add(20);
		AL.add(30);
		AL.add(40);
		AL.add(50);
		AL.add(60);
		
		System.out.println(AL);
		
		System.out.println(AL.indexOf(30));
		
		AL.add(2, 500); //Elements shifted to right
		System.out.println(AL);
		System.out.println(AL.indexOf(30));
		
		AL.add(3, 900);
		System.out.println(AL);
		System.out.println(AL.indexOf(30));
		
		AL.remove(1);
		
		System.out.println(AL);
		System.out.println(AL.indexOf(30));// Elements shifted to left
		
	}

}


/*[10, 20, 30, 40, 50, 60]
2
[10, 20, 500, 30, 40, 50, 60]
3
[10, 20, 500, 900, 30, 40, 50, 60]
4
[10, 500, 900, 30, 40, 50, 60]
3
*/