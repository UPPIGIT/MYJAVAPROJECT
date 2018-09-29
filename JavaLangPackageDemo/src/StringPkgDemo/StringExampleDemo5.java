package StringPkgDemo;

public class StringExampleDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("StringBuffer to String");
		StringBuffer sb= new StringBuffer("upender");
		
		String st=sb.toString();
		
		System.out.println(sb);
		System.out.println(st);
		
		sb.append("tadewar");
		System.out.println(sb);
		System.out.println(st);
		

	}

}
