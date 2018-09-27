package StringPkgDemo;

public class StringMethodsDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Java String valueOf() Example*/
		
	/*	String valueOf() method to convert the integer, float, long, double, char and char array to the String*/
		
		
		byte b=20;
		short s=50;
		int i=100;
		float f= 45.75f;
		double d= 47.89;
		long l=7777l;
		char ch[]= {'u','p','e','n','d','e','r'};
		
		boolean bln=true;
		
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(s));
		System.out.println(String.valueOf(i));
		System.out.println(String.valueOf(f));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(l));
		System.out.println(String.valueOf(ch));
		
		System.out.println(String.valueOf(bln));
		System.out.println(String.valueOf("abc"));
		System.out.println(String.valueOf('U'));
	
		
		
		
		System.out.println("==================intern() method examples=============");
		
		String s1= new String("hello");
		String s2="hello";
		
		System.out.println(s1==s2);
		
		String s3=s1.intern();
		
		System.out.println(s1==s3);
		
		String s4=new String("hello");
		System.out.println(s1==s4);
		
		String s5="upender";
		String s6=new String("upender").intern();
		System.out.println(s5==s6);
		
		System.out.println("============isEmptyMethod()======");
		
		String str1="";
		String str2="upender";
		
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());
		
		System.out.println("===========check given string is null or empty");
		
		String str3=null;
		
		if (str3==null || str3.isEmpty()) {
			System.out.println("string is empty or null");
			
		} else {
			System.out.println("string is not null or empty"+str3);
		}
		
		if (str2==null||str2.isEmpty()) {
			System.out.println("string is empty or null");
			
		} else {
			System.out.println(str2);
		}
		
		
	}

}
