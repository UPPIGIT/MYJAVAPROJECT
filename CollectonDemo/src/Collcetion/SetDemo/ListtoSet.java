package Collcetion.SetDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class ListtoSet {

		public static void main(String[] args) {
			
			
			
			ArrayList<Integer> al= new ArrayList<>();
			
			al.add(10);
			al.addAll(Arrays.asList(22,77,74,85,96,22,null,null));
			
			HashSet<Integer> hs = new HashSet<>(al);
			System.out.println(hs);
			
			LinkedList<Integer> ll = new LinkedList<>();
			ll.addAll(Arrays.asList(98,87,54,65,22,22,null,null));
			
			HashSet<Integer> hs2= new HashSet<>(ll);
			
			System.out.println(hs2);
			
		}
}

/*[96, null, 85, 22, 10, 74, 77]
[null, 65, 98, 54, 22, 87]*/