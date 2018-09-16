package StringPkgDemo;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= new String("upender");
		String s2=s1.toUpperCase();
		String s3=s1.toLowerCase();
		
		
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//true
		
		String s4=s2.toLowerCase();
		System.out.println(s2==s4);//false
		String s5=s4.toUpperCase();
		System.out.println(s4==s5);//false
		
		String st1="upender";
		String st2=st1.toUpperCase();
		String st3=st1.toLowerCase();
		System.out.println(st1==st2);//false
		System.out.println(st1==st3);//true
		
		String st4=st2.toLowerCase();
		System.out.println(st2==st4);//false
		String st5=st4.toUpperCase();
		System.out.println(st4==st5);//false
		

	}

}
