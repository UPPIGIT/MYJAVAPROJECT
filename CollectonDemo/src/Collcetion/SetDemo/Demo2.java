package Collcetion.SetDemo;

import java.util.HashSet;

public class Demo2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1="Upender";
		String s2=new String("Upender");
		String s3="Upender";
		String s4=new String("Upender");
		String s6=s1;
		String s5=s2;
		
		HashSet<String> hss= new HashSet<>();
		
		hss.add(s1);
		hss.add(s2);
		hss.add(s3);
		hss.add(s4);
		hss.add(s5);
		hss.add(s6);
		
		
		System.out.println(hss);

	}

}
