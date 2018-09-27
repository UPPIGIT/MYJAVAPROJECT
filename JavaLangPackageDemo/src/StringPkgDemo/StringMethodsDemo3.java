package StringPkgDemo;

public class StringMethodsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=============indexOf() method ==========");
		
		String str="I am upender I am working in cts in it dept I am a developer";
		
		System.out.println(str.indexOf('I'));
		System.out.println(str.indexOf("I",5));
		System.out.println(str.indexOf('I',14));
		System.out.println(str.indexOf('I', 45));
		
		System.out.println(str.indexOf("am"));
		System.out.println(str.indexOf("am", 6));
		System.out.println(str.indexOf("am", 16));
		System.out.println(str.indexOf("am", 47));
		
		System.out.println(str.indexOf("am",200));
		System.out.println(str.indexOf("am",-1));
		
		System.out.println("=============lastIndexOf() method ==========");
		
		
		System.out.println(str.lastIndexOf('I'));
		System.out.println(str.lastIndexOf("I",5));
		System.out.println(str.lastIndexOf('I',14));
		System.out.println(str.lastIndexOf('I', 45));
		
		System.out.println(str.lastIndexOf("am"));
		System.out.println(str.lastIndexOf("am", 6));
		System.out.println(str.lastIndexOf("am", 16));
		System.out.println(str.lastIndexOf("am", 47));
		
		System.out.println(str.lastIndexOf("am",200));
		System.out.println(str.lastIndexOf("am",-1));

		
		System.out.println("======================length() method==============");
		
		System.out.println("length of the string with spaces :"+str.length());
		System.out.println("lenth of the string without spaces :"+str.replace(" ", "").length());
		
		System.out.println("=======================replace() method===============");
		
		String string="abcabdabcd";
		
		System.out.println(string.replace('b', 'X'));
		
		String string2="abc xyz lmn abc com net pqr abc";
		
		System.out.println(string2.replace("abc", "ddd"));
		
		System.out.println(string2.replaceFirst("abc", "OOO"));
		
		 String strr = new String("Site is BeginnersBook.com");
		 System.out.println(strr.replaceFirst("Beginners(.*)", "abc.com"));
		 
		 System.out.println(string2.replaceAll("abc", "RRR"));
	}

}
