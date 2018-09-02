package Collcetion.SetDemo;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts= new TreeSet<>();
		
		ts.add(11);
		ts.add(55);
		ts.add(33);
		ts.add(88);
		ts.add(10);
	//	ts.add(null); //NPE
		
		System.out.println(ts);
		
		TreeSet<String> ts1= new TreeSet<>();
		ts1.add("cat");
		ts1.add("donkey");
		ts1.add("CAT");
		ts1.add("Apple");
		ts1.add("Monkey");
	//	ts1.add(null); NPE
		ts1.add("88");
		
		System.out.println(ts1);
		
		TreeSet<Object> ts3= new TreeSet<>();
		
		ts3.add("uppi");
		ts3.add("java");
		ts3.add("jsp");
		ts3.add(41); //CCE
		
		System.out.println(ts3);

	}

}

//[10, 11, 33, 55, 88]
/*
Exception in thread "main" java.lang.NullPointerException
at java.base/java.util.TreeMap.put(Unknown Source)
at java.base/java.util.TreeSet.add(Unknown Source)
at Collcetion.SetDemo.TreeSetDemo.main(TreeSetDemo.java:17)*/

/*//[10, 11, 33, 55, 88]
[Apple, CAT, Monkey, cat, donkey]*/

/*
[10, 11, 33, 55, 88]
[88, Apple, CAT, Monkey, cat, donkey]
Exception in thread "main" java.lang.ClassCastException: java.base/java.lang.String cannot be cast to java.base/java.lang.Integer
	at java.base/java.lang.Integer.compareTo(Unknown Source)
	at java.base/java.util.TreeMap.put(Unknown Source)
	at java.base/java.util.TreeSet.add(Unknown Source)
	at Collcetion.SetDemo.TreeSetDemo.main(TreeSetDemo.java:37)*/