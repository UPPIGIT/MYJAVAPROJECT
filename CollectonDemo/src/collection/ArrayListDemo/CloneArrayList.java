package collection.ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class CloneArrayList {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>(Arrays.asList("UPPI","SRU","ABC","DEF"));
		
		
		@SuppressWarnings("unchecked")
		ArrayList<String> al2=(ArrayList<String>) al.clone();
		
		System.out.println(al2);
	}
}
