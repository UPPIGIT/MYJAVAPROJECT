package StringPkgDemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//case1
		System.out.println("==========case 1=");
		String s1 = new String("Upender");
		s1.concat("tadewar");//we can not modify the String object this is called immutabilty of string
		
		System.out.println(s1);
		
		//case2 -- we can modify StrungBuffer object
		System.out.println("==========case 2=");
		
		StringBuffer s2= new StringBuffer("Upender");
		s2.append("tadewar");
		System.out.println(s2);
		
		//case3 : In String class .equals() method is overridden for content comparison
		//In StringBuffer class .euauls() method is not overriden
		
		//note when String object is create in heap with new object is create with unique reference
		
		System.out.println("==========case 3=");
		
		String st1= new String("Upender");
		String st2=new String("Upender");
		
		System.out.println(st1.equals(st2));//true
		System.out.println(st1==st2);//false
		
		StringBuffer sb1= new StringBuffer("Upender");
		StringBuffer sb2= new StringBuffer("Upender");
		
		System.out.println(sb1.equals(sb2));//false
		System.out.println(sb1==sb2);//false
		
		//case4
		System.out.println("==========case 4====");
		String str1= new String("first");
		String str2= new String("first");
		String str3="first";
		String str4="first";
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));
		
		System.out.println(str1.equals(str2));
	}

}
