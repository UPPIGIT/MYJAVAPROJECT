package collection.ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedList {
	
	public static void main(String[] args) {
		
		ArrayList<String> AL = new ArrayList<>();
		
		AL.add("abc");
		AL.add("LMN");
		
		System.out.println("non Synchronized lsit "+AL);
		
		List<String> AL1= Collections.synchronizedList(AL);
		
		System.out.println("Synhronized list : "+AL1);
	}

}
