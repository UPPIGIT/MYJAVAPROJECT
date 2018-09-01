package Collcetion.SetDemo;

import java.util.HashSet;

public class Demo3 {
	
	Integer no;
	String name;
	

	public Integer getNo() {
		return no;
	}


	public void setNo(Integer no) {
		this.no = no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Demo3(Integer no, String name) {
	
		this.no = no;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Demo3 [no=" + no + ", name=" + name + "]";
	}

	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return getNo();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		System.out.println("my eqaul class");
		return super.equals(obj);
	}

	public static void main(String[] args) {
		
		Demo3 d1= new Demo3(1111, "abc");
		Demo3 d2= new Demo3(2222, "abc");
		Demo3 d3= new Demo3(3333, "abc");
		Demo3 d4= new Demo3(4444, "abc");
		Demo3 d5= new Demo3(5555, "abc");
		Demo3 d6= new Demo3(2222, "abc");
		
		HashSet<Demo3> hs=new HashSet<>();
		hs.add(d1);
		hs.add(d2);
		hs.add(d3);
		hs.add(d4);
		hs.add(d5);
		hs.add(d6);
		
		System.out.println(hs);
		
		
	}
}
