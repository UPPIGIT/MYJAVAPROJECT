package StringPkgDemo;

public class StringMethodsDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=new String("upender/tadewar/cts/pune/mh");
		
		String array[]=str.split("/");
		
		for (String string : array) {
			System.out.println(string);
			
		}
		
		
	String array1[]=str.split("/",3);
		
		for (String string : array1) {
			System.out.println(string);
			
		}
		
		
	String array2[]=str.split("/",0);
		
		for (String string : array2) {
			System.out.println(string);
			
		}

	String array3[]=str.split("/",-10);
		
		for (String string : array3) {
			System.out.println(string);
			
		}
		
		String str2="bbaaccaa";
		
		String arr[]=str2.split("a",0);
		
		for (String string : arr) {
			
			System.out.println("::"+string);
			
		}
		
	String arr2[]=str2.split("a",-5);
		
		for (String string : arr2) {
			
			System.out.println("::"+string);
			
		}
}

}
