package StringPkgDemo;

public class StringMethodsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("===========charAt(int index)========");
		String s1="welcome to java string demo";
		
		System.out.println("character at index 3 :"+s1.charAt(3));
		System.out.println("character at index 15 :"+s1.charAt(15));
		System.out.println("character at index 25 :"+s1.charAt(25));
//		System.out.println("character at index -1 :"+s1.charAt(-1)); java.lang.StringIndexOutOfBoundsException
//		System.out.println("character at index 25 :"+s1.charAt(100)); java.lang.StringIndexOutOfBoundsException
		
		System.out.println("===========contains(another string)========");
		System.out.println("s1 contains java :"+s1.contains("java"));
		System.out.println("s1 contains demo :"+s1.contains("demo"));
		System.out.println("s1 contains hello :"+s1.contains("hello"));
	//	System.out.println("s1 contains null :"+s1.contains(null));java.lang.NullPointerException
		
		System.out.println("===========contains(another string) with if else========");
		
		if(s1.contains("welcome")) {
			System.out.println("S1 contains welcome");
		}else
		{
			System.out.println("S1 doesn't contains welcome");
		}
		
		System.out.println("Java String contains() method for case insensitive check");
		
		System.out.println("S1 contains WELCOME :"+s1.contains("WELCOME"));
		System.out.println("s1 contains WELCOME :"+s1.toUpperCase().contains("WELCOME") );
		
		System.out.println("===========compareTo() method =====");
		
		String st1="upender";
		String st2="tadewar";
		String st3="upender";
		String st4="upender tadewar";
		
		System.out.println(st1.compareTo(st2));
		System.out.println(st1.compareTo(st3));
		System.out.println(st1.compareTo(st4));
//		System.out.println(st1.compareTo(null));java.lang.NullPointerException
		
		System.out.println("===============concat(strung str)======== ");
		System.out.println(st4.concat(" ").concat("cognizant").concat(" ").concat("pune"));
		
		System.out.println("===============subString(String str)===========");
		
		System.out.println(st4.substring(7));
		System.out.println(st4.substring(0, 7));
	//	System.out.println(st4.substring(-1));java.lang.StringIndexOutOfBoundsException
	//	System.out.println(st4.substring(45));java.lang.StringIndexOutOfBoundsException
	//	System.out.println(st4.substring(7,1));java.lang.StringIndexOutOfBoundsException
		
		System.out.println("==============compareToIgnoreCase()============");
		
		String str1="hello";
		String str2="HELLO";
		String str3="Hello";
		
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.compareToIgnoreCase(str3));
		System.out.println(str2.compareToIgnoreCase(str3));

	}

}
