package Collcetion.SetDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class MyStudent implements Comparable {

	Integer stRoolno;
	String stName;
	
	
	public MyStudent(Integer stRoolno, String stName) {
	
		this.stRoolno = stRoolno;
		this.stName = stName;
	}

	
	@Override
	public int compareTo(Object o) {
		
		MyStudent studentobj=(MyStudent)o;
		if (studentobj.stRoolno>stRoolno) {
			
			return -1;
			
		} else if(studentobj.stRoolno<stRoolno) {
			
			return +1;

		}else {
			
			return 0;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStudent s1= new MyStudent(1001, "Upender");
		MyStudent s2= new MyStudent(1002, "Tadewar");
		MyStudent s3= new MyStudent(1003, "Sruthi");
		MyStudent s4= new MyStudent(1004, "Potti");
		MyStudent s5= new MyStudent(1001, "abc"); //dublicates not allowed
	//	MyStudent s6= new MyStudent(null, "Tadewar");//NPE
		
		
		TreeSet<MyStudent> ts= new TreeSet<>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
	//	ts.add(s6);
		
		Iterator<MyStudent> stuitr=ts.iterator();
		
		while (stuitr.hasNext()) {
			MyStudent myStudent = (MyStudent) stuitr.next();
			
			System.out.println(myStudent.stName);
			System.out.println(myStudent.stRoolno);
			
			System.out.println("============================================");
			
		}

	}



}


/*
note 1: if we are not implemented Comparable . jvm will throw below exception
  Exception in thread "main" java.lang.ClassCastException: Collcetion.SetDemo.MyStudent
   cannot be cast to java.base/java.lang.Comparable
	at java.base/java.util.TreeMap.compare(Unknown Source)
	at java.base/java.util.TreeMap.put(Unknown Source)
	at java.base/java.util.TreeSet.add(Unknown Source)
	at Collcetion.SetDemo.MyStudent.main(MyStudent.java:27)
 */