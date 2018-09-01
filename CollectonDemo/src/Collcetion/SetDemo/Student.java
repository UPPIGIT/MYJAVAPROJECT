package Collcetion.SetDemo;

import java.util.HashSet;



public class Student {
	
	Integer rollno;
	String  name;
	
	public Student(Integer rollno,String name) {
		
		this.rollno=rollno;
		this.name=name;
	}
	
	

	public Integer getRollno() {
		return rollno;
	}



	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public int hashCode() {
		System.out.println("I am hashcode of Student class                   :"+getRollno());
		return getRollno();
	}

	
	
	@Override
	public boolean equals(Object obj) {
		
		
		
		Student object =(Student)obj;
		System.out.println("I am equal method of student class");
		System.out.println(object.rollno+":"+object.name);
		System.out.println(getRollno()+":"+getName());
	
		System.out.println(object.rollno.equals(getRollno()));
		
		return (object.rollno.equals(getRollno()));
	}

   @Override
	public String toString() {
		
		return getRollno()+":"+getName();
	}
   
	public static void main(String[] args) {
		
		Student s1 = new Student(1011, "UPENDER");
		Student s2= new Student(1022, "potti");
		Student s9 = new Student(8881, "UPENDER");
		Student s10= new Student(9991, "potti");
		Student s3 = new Student(1011, "abc");
		Student s4 = new Student(1021, "xyz");
		Student s5 = new Student(1031, "RISHI");
		Student s6= new Student(1041, "MANI");
		Student s7 = new Student(1051, "SATWIK");
		Student s8 = new Student(1061, "CHINNI");
		Student s11=s10;
		
		HashSet<Student> hs = new HashSet<>();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);
		hs.add(s7);
		hs.add(s8);
		hs.add(s9);
		hs.add(s10);
		hs.add(s11);
		
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		

	}

}


/*I am hashcode of Student class                   :101
I am hashcode of Student class                   :102
I am hashcode of Student class                   :101
I am equal method of student class
101:UPENDER
101:abc
true
I am hashcode of Student class                   :102
I am equal method of student class
102:potti
102:xyz
true
I am hashcode of Student class                   :103
I am hashcode of Student class                   :104
I am hashcode of Student class                   :105
I am hashcode of Student class                   :106
I am hashcode of Student class                   :888
I am hashcode of Student class                   :999
I am hashcode of Student class                   :999
[101:UPENDER, 102:potti, 103:RISHI, 999:potti, 104:MANI, 888:UPENDER, 105:SATWIK, 106:CHINNI]
8
*/