package Collcetion.SetDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;



public class ArrayToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intarr= {11,2,33,41,52,63,74,85,96};
		
		//1.
		
		HashSet<Integer> hs1= new HashSet<>(Arrays.asList(intarr));
		
		System.out.println(hs1);

		//2
		
		HashSet<Integer> hs2= new HashSet<>();
		Collections.addAll(hs2, intarr);
		
		System.out.println(hs2);
		
		//3. 
		
		HashSet<Integer> hs3= new HashSet<>();
		hs3.addAll(Arrays.asList(intarr));
		
		System.out.println(hs3);
	}

}


/*[96, 33, 2, 52, 85, 41, 74, 11, 63]
[96, 33, 2, 52, 85, 41, 74, 11, 63]
[96, 33, 2, 52, 85, 41, 74, 11, 63]*/