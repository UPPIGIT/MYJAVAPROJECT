package StringPkgDemo;

public class StringMethodsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Java String valueOf() method returns the String representation of the boolean, char, char array, int, long, float and double arguments. We have different versions of this method for each type of arguments. The signature of this method is as follows:

			Method valueOf() signature:

			public static String valueOf(boolean b): Used for converting boolean value to a String
			public static String valueOf(char c): char to String
			public static String valueOf(int i): int to String
			public static String valueOf(long l): long to String
			public static String valueOf(float f): float to String
			public static String valueOf(double d): double to String*/
		
		
		System.out.println("==================valueOf() method================");
		
		int i=200;
		float f=257.12f;
		double d=457.78;
		long l=12345678l;
		char ch='c';
		char array[]= {'u','p','p','i'};
		
		String str1=String.valueOf(i);
		String str2=String.valueOf(f);
		String str3=String.valueOf(d);
		String str4=String.valueOf(l);
		String str5=String.valueOf(ch);
		String str6=String.valueOf(array);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		
		System.out.println("============startWith()============");
		
		String string="apple bat cat dog elephant lemon";
		
		System.out.println(string.startsWith("apple"));
		System.out.println(string.startsWith("bat"));
		
		System.out.println(string.startsWith("dog",14));
		System.out.println(string.startsWith("elephant",18));
		
		System.out.println("============endsWith()============");
		System.out.println(string.endsWith("lemon"));
		System.out.println(string.endsWith("elephant"));
		
		
		System.out.println("===========equals() and equalsIgnoreCase()=============");
		
		String st1="hello";
		String st2="Hello";
		String st3="HELLO";
		String st4="welcome";
		String st5="hello";
		
		
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st1.equals(st5));
		
		
		System.out.println(st1.equalsIgnoreCase(st2));
		System.out.println(st1.equalsIgnoreCase(st3));
		System.out.println(st1.equalsIgnoreCase(st4));
		System.out.println(st1.equalsIgnoreCase(st5));
		
		
		
		System.out.println("=================format() method======================================");
		
		String string1="Upender";
		
		String fomattedString1=String.format("My name is %s", string1);
		
		System.out.println(fomattedString1);
		
		String fomattedString2=String.format("My string is %.8f",12.34);
		
		System.out.println(fomattedString2);
		
		String string2="tadewar";
		String string3="cognizant";
		String string4="pune";
		
		String finalString=String.format("My string is :%1$s %2$s . %3$s,%4$s", string1,string2,string3,string4);
		
		System.out.println(finalString);
		
		System.out.println("===========padding using format() method of string==========");
		
		int str=78;
		
		String leftpaddingString=String.format("%05d", str);
		System.out.println(leftpaddingString);
		


	}

}
