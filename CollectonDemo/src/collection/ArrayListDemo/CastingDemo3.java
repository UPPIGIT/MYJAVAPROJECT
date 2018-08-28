package collection.ArrayListDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CastingDemo3 {
	
	public static Integer totalmarks(List<String> list) {
		
		Integer totalmarks=0;
		
		ListIterator<String> iterator=list.listIterator();
		
		while(iterator.hasNext())
		{
			
			totalmarks=totalmarks+Integer.parseInt(iterator.next());
		}
		return totalmarks;
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> marks = new ArrayList<>();
	
		marks.add("99");
		marks.add("98");
		marks.add("85");
		
		System.out.println(totalmarks(marks));
		
		ArrayList<Integer> marks1= new ArrayList<>();
		
		marks1.add(85);
		marks1.add(78);
		marks1.add(65);
		
		ArrayList<String> newmarks = new ArrayList<>(marks1.size());
		
		for (Integer integer : marks1) {
			
			newmarks.add(String.valueOf(integer));
		
		}
		
		System.out.println(totalmarks(newmarks));
	}

}
