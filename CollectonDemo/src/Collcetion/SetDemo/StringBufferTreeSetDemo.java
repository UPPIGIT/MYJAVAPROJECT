package Collcetion.SetDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class StringBufferTreeSetDemo  {

	public static void main(String[] args) {
		
		TreeSet<StringBuffer> ts=new TreeSet<>(new Mycomparator1());
		
		StringBuffer sb = new StringBuffer("Java");
		StringBuffer sb1= new StringBuffer("wmb");
		StringBuffer sb2 = new StringBuffer("IIB");
		StringBuffer sb3= new StringBuffer("MQ");
		StringBuffer sb4= new StringBuffer("JSP");
		StringBuffer sb5= new StringBuffer("Servlets");
		
		ts.add(sb1);
		ts.add(sb2);
		ts.add(sb);
		ts.add(sb3);
		ts.add(sb4);
		ts.add(sb5);
		
		System.out.println(ts);
		
	}
}

/*Exception in thread "main" java.lang.ClassCastException:
  java.base/java.lang.StringBuffer cannot be cast to java.base/java.lang.Comparabl*/
 

/*Note :StringBuffer class won't implement compareTO method of comparable interface*/

class Mycomparator1 implements Comparator<StringBuffer>
{
	
	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
	
		String s1 =o1.toString();
		String s2 =o2.toString();
		
		return s1.compareTo(s2);
		
		
	}
	
}