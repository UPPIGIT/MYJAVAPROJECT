package StringPkgDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringExampleDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ASCII to String");
		
		int[] num= {65, 120, 98, 75, 115};
		
		for ( int i : num) {
			System.out.println(Character.toString((char)i));
		}
		
		
		System.out.println("String[] to ArrayList");
		
		String[] strArray= {"10","20","30","40","50"};
		
		List<String> al = new ArrayList<>();
		al = Arrays.asList(strArray);
		
		System.out.println(al);

	}

}
