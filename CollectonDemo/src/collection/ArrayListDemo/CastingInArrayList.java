package collection.ArrayListDemo;

import java.util.ArrayList;

public class CastingInArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(Integer.parseInt("100"));
		al.add(Integer.parseInt("200"));
	//	al.add(Integer.parseInt("55.88")); throws below exception 1
		
		al.add(new Integer("500"));
		
		System.out.println(al);
		
		//Object[] object ={"88","99","77","LL"};//throws below exception 1
		
		Object[] object ={"88","99","77"};
		
		for (Object object2 : object) {
			//al.add((Integer)object2); throws below exception 2
			
			al.add(Integer.parseInt((String)object2));
			
			al.add(new Integer((String)object2));
		}
		
		System.out.println(al);
	
	}

}
/*
1.Exception in thread "main" java.lang.NumberFormatException: For input string: "LL"
	at java.lang.NumberFormatException.forInputString(Unknown Source)
	at java.lang.Integer.parseInt(Unknown Source)
	at java.lang.Integer.parseInt(Unknown Source)
	at collection.ArrayListDemo.CastingInArrayList.main(CastingInArrayList.java:23)
*/

/*2.Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
at collection.ArrayListDemo.CastingInArrayList.main(CastingInArrayList.java:21)*/
