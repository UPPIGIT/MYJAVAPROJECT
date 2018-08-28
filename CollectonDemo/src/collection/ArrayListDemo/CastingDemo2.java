package collection.ArrayListDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CastingDemo2 {
	
	public static String findGrade(Integer totalmarks)
	{
		String grade="";
		
		if (totalmarks>250) {
			
			grade ="A";
			
		} else if(totalmarks<250 && totalmarks>150) {
			grade ="B";
		}else {
			grade="C";
		}
		
		return grade;
	}

	public static Integer caluclateTotal(List<Integer> list)
	{
		Integer totalmarks =0;
		
		ListIterator<Integer> iterator=list.listIterator();
		
		while(iterator.hasNext())
		{
			totalmarks=totalmarks+iterator.next();
			
		}
		return totalmarks;
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<>();
		
		marks.add(Integer.valueOf("96"));
		marks.add(Integer.valueOf("99"));
		marks.add(Integer.valueOf("98"));
		
		System.out.println("Total Marks :"+caluclateTotal(marks));
		System.out.println("grade :"+findGrade(caluclateTotal(marks)));
		
		ArrayList<Integer> marks1 = new ArrayList<>();
		
		marks1.add(Integer.valueOf("50"));
		marks1.add(Integer.valueOf("60"));
		marks1.add(Integer.valueOf("70"));
		
		System.out.println("Total Marks :"+caluclateTotal(marks1));
		System.out.println("grade :"+findGrade(caluclateTotal(marks1)));
		
		
		ArrayList<Integer> marks2 = new ArrayList<>();
		
		marks2.add(Integer.valueOf("50"));
		marks2.add(Integer.valueOf("30"));
		marks2.add(Integer.valueOf("35"));
		
		System.out.println("Total Marks :"+caluclateTotal(marks2));
		System.out.println("grade :"+findGrade(caluclateTotal(marks2)));
		
		ArrayList<Integer> marks3 = new ArrayList<>();
		
		Object[] objectarr ={"90","50","56",45,89,205.05};
		
		for (Object object : objectarr) {
			if (object instanceof String) {
				
				
				marks3.add(Integer.valueOf((String)object));
				
			} else if(object instanceof Integer){
				
				marks3.add((Integer)object);

			} else if (object instanceof Double) {
			
				System.out.println("Round of valur :"+Integer.valueOf(String.valueOf(Math.round(Double.parseDouble(object.toString())))));
				 marks3.add(Integer.valueOf(String.valueOf(Math.round(Double.parseDouble(object.toString())))));
				
				//marks3.add(Integer.valueOf((int)object));//java.lang.ClassCastException
				
				//marks3.add(Integer.valueOf(object.toString()));//java.lang.NumberFormatException
				
			}
			
			
		}
		
		System.out.println("Total Marks :"+caluclateTotal(marks3));
		System.out.println("grade :"+findGrade(caluclateTotal(marks3)));
		
		ArrayList<Integer> marks4 = new ArrayList<>();
		
		marks4.add(Integer.valueOf("50"));
		marks4.add(Integer.valueOf("60"));
		marks4.add(Integer.valueOf("70"));
		
		
		System.out.println("Total Marks :"+caluclateTotal(marks4));
		System.out.println("grade :"+findGrade(caluclateTotal(marks4)));
		
		LinkedList<Integer> marks5 = new LinkedList<>();
		
		marks5.add(Integer.valueOf("99"));
		marks5.add(Integer.valueOf("88"));
		marks5.add(Integer.valueOf("70"));
		
		
		System.out.println("Total Marks :"+caluclateTotal(marks5));
		System.out.println("grade :"+findGrade(caluclateTotal(marks5)));
		
		
		
	}
}
