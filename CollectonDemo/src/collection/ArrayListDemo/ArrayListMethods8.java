package collection.ArrayListDemo;
import java.util.ArrayList;

public class ArrayListMethods8 {

	public static void main(String[] args) {
		
		ArrayList<Integer> AL = new ArrayList<>();
		
		AL.add(100);
		AL.add(200);
		AL.add(300);
		AL.add(400);
		AL.add(500);
		
	ArrayList<Integer> AL1 = new ArrayList<>();
		
		AL1.add(10);
		AL1.add(20);
		AL1.add(30);
		AL1.add(40);
		AL1.add(50);
		
		AL.addAll(AL1);
		
		System.out.println(AL);
		
		System.out.println(AL.remove((Integer)400)); //return true
		System.out.println(AL.remove((Integer)900)); //return false
		System.out.println(AL.remove(1));//return element
		
		System.out.println(AL);
		
		ArrayList<Integer> AL2 = new ArrayList<>();
		
		AL2.add(10);
		AL2.add(300);
		AL2.add(50);
		AL2.add(550);
		
		System.out.println(AL);
		System.out.println(AL.removeAll(AL2)); //true
		System.out.println(AL);
		
		
		ArrayList<Integer> AL3 = new ArrayList<>(AL2);
		System.out.println("AL3 :" +AL3);
		
		
		
		//Array list to Array
		
		Object[] array = AL3.toArray();
		
		for (Object object : array) {
			
			System.out.println(object);
			
		}
		
	}
	
	
	
	
}
