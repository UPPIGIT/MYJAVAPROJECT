package StringPkgDemo;

public class StringConsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//1.
		
		String s1= new String();
		
	//2.
		
		String s2= new String("upender");
		
	//3 
		StringBuffer sb1= new StringBuffer("uppi");
		
		String s3= new String(sb1);
		
	//4
		
		char[] ch= {'u','p','p','i'};
		String s4= new String(ch);
		
	//5
		
		byte[] b= {100,101,102,103};
		String s5= new String(b);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

	}

}
