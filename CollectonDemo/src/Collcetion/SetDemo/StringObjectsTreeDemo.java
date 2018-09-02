package Collcetion.SetDemo;

import java.util.Comparator;
import java.util.TreeSet;

/*Sorting order is increasing length order--if two strings lenth order sort in alphabetical order*/

public class StringObjectsTreeDemo {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		String s1="nizamabad";
		String s2="hyderabad";
		String s3="vizag";
		StringBuffer s4= new StringBuffer("mumabi");
		StringBuffer s5= new StringBuffer("pune");
		StringBuffer s6= new StringBuffer("nanded");
		StringBuffer s7= new StringBuffer("banglore");
		StringBuffer s8= new StringBuffer("vishakapatnam");
		
		TreeSet ts = new TreeSet<>(new CustomComparator());
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);
		
		System.out.println(ts);
	}

}

@SuppressWarnings("rawtypes")
class CustomComparator implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		
		String s1= o1.toString();
		String s2=o2.toString();
		
		int len1=s1.length();
		int len2=s2.length();
		
		if (len1<len2) {
			return -1;
		}else if (len1>len2) {
			return +1;
			
			
		}else {
			return s1.compareTo(s2);
		}
	}

}

/*[pune, vizag, mumabi, nanded, banglore, hyderabad, nizamabad, vishakapatnam]
*/