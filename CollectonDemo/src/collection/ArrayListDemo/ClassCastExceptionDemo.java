package collection.ArrayListDemo;

import java.util.ArrayList;


public class ClassCastExceptionDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("abc");
		al.add("xyz");
		
		//String[] str=(String[])al.toArray();
	
		/*Exception in thread "main" java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.String;
	at collection.ArrayListDemo.ClassCastExceptionDemo.main(ClassCastExceptionDemo.java:14)
*/	
	
		
	Object[] str= al.toArray();
		
		for (Object object : str) {
			
			System.out.println(object);
		}
		
		

		
	}

}
