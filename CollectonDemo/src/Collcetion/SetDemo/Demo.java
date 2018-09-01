package Collcetion.SetDemo;

import java.util.HashSet;

public class Demo {
	
	Integer no;
	String name;

	public Demo(Integer no, String name) {
		
		this.no = no;
		this.name = name;
	}
	

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
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		return getNo();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("My string class");
		Demo demo=(Demo)obj;
		
		return demo.no.equals(getNo());
	}	
	@Override
	public String toString() {
		return "Demo [no=" + no + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Demo> hs= new HashSet<>();
		
	
		Demo d1=new Demo(2222, "pqr");
		Demo d2=new Demo(3333, "aaa");
		Demo d3=new Demo(4444, "bbb");
		Demo d4=new Demo(1111, "abc");
		Demo d5=new Demo(1111, "xyz");
		
		Demo d6=d2;
		Demo d7=new Demo(3333, "aaa");
		
		
		
		hs.add(d1);
		hs.add(d2);
		hs.add(d3);
		hs.add(d4);
		hs.add(d5);
		hs.add(d6);
		hs.add(d7);
		

		System.out.println(hs);
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		System.out.println(d4.hashCode());
		System.out.println(d5.hashCode());
		System.out.println(d6.hashCode());
		System.out.println(d7.hashCode());
	}

}
