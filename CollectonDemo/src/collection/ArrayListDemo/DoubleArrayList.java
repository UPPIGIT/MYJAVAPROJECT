package collection.ArrayListDemo;

import java.util.ArrayList;

public class DoubleArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Double> doublelist = new ArrayList<>();
		
		doublelist.add((Double.valueOf("58")));
		doublelist.add(Double.valueOf(String.valueOf(20)));
		doublelist.add(Double.valueOf(String.valueOf(15.5f)));
		doublelist.add(Double.valueOf((Integer)88));
		//doublelist.add(Double.valueOf("abc"));java.lang.NumberFormatException:
		doublelist.add(Double.parseDouble("999"));
		
		System.out.println(doublelist);
	}

}
