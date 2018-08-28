package collection.ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods10 {
	
	public static void main(String[] args) {
		
		
		/*Array to ArrayList*/
		
		String[] stringArry= new String[]{"UPPI","TADEWAR","SRUTHI","PARDIWAR"};
		
		//Method1
		
		ArrayList<String> AL= new ArrayList<>(Arrays.asList(stringArry));
		
		System.out.println(AL);
		
		//Method2
		
		List<String> list =  Arrays.asList(stringArry);
		
		ArrayList<String> AL3 = new ArrayList<>();
		
		AL3.addAll(list);
		System.out.println(AL3);
		
		ArrayList<String> AL4 = new ArrayList<>();
		
		Collections.addAll(AL4, stringArry);
		System.out.println(AL4);
		
	}

}
