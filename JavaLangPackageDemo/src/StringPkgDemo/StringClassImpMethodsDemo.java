package StringPkgDemo;

public class StringClassImpMethodsDemo {
	
	public static void main(String[] args) {
		
		String s1="Upender Tadewar";
		
		System.out.println(s1.charAt(5));
	//	System.out.println(s1.charAt(45));java.lang.StringIndexOutOfBoundsException
		
		String str1="Upender";
		String str2=str1.concat(str1);
		System.out.println(str2);
		
		String string1=new String("upender");
		String string2=new String("Tadewar");
		String string3= new String("upender");
		String string4= new String("Upender");
		
		System.out.println(string1.equals(string2));
		System.out.println(string1.equals(string3));
		System.out.println(string1.equals(string4));
		
		System.out.println(string1.equalsIgnoreCase(string4));
		
		String mainString="upender tadewar cognizant pune mh";
		String subString=mainString.substring(6);
		System.out.println(subString);
		
		System.out.println(mainString.substring(6, 25));
		//System.out.println(mainString.substring(15, 45));java.lang.StringIndexOutOfBoundsException
		
		System.out.println(mainString.length());
		
		String str="abbcdbbefg";
		System.out.println(str.replace('b','x'));
		
		String st1="upender";
		System.out.println(st1.toUpperCase());
		
		String st2="UPENDER";
		System.out.println(st2.toLowerCase());
		
		String st3="abcdabcdef";
		System.out.println(st3.indexOf('a'));
		System.out.println(st3.lastIndexOf('a'));
		
		System.out.println(st3.indexOf('x'));
		System.out.println(st3.lastIndexOf('y'));
		
		System.out.println(st3.indexOf("abc"));
		System.out.println(st3.lastIndexOf("abc"));
		System.out.println(st3.indexOf("xyz"));
		System.out.println(st3.lastIndexOf("apq"));
		
		System.out.println(st3.indexOf('a', 1));
	}

}
