package collection.ArrayListDemo;
import java.util.ArrayList;

public class ArrayListMethods6 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		Integer a,b,c,d,e;
		
		a=10;
		b=20;
		c=30;
		d=40;
		e=50;
		
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		al.add(e);
		
		System.out.println(al);
		
		a=100;
		b=200;
		c=300;
		d=400;
		e=500;
		
		System.out.println(al); //NO change
		
		
	}

}


/*[10, 20, 30, 40, 50]
[10, 20, 30, 40, 50]
*/