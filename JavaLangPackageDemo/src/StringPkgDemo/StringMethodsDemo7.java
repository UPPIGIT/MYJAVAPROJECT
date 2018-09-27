package StringPkgDemo;

import java.util.Arrays;
import java.util.List;

public class StringMethodsDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("string join() method");
		
		String str1= String.join("-", "upender","tafewar","cts","pune");
		System.out.println(str1);
		
		String str2=String.join("~", "core java","jsp","servlets");
		System.out.println(str2);
		
		List<String> al=Arrays.asList("hyd","pune","bglr","mumbai");
		
		String str3=String.join("|", al);
		System.out.println(str3);
		
		
		System.out.println("==================getChars()==============");
		
		
		String st1="welcome to cognizant pune";
		char ch[]= new char[10];
		
		st1.getChars(0, 7, ch, 0);
		
		for (char c : ch) {
			System.out.print(c);
		}
		
		System.out.println();
		
		char ch1[]= new char[30];
		st1.getChars(8, 25, ch1, 0);
			for (char c : ch1) {
				System.out.print(c);
			}
			
			/*The method copyValueOf() is used for copying an array of characters to the String.
			 *  The point to note here is that this method does not append the content in String, 
			 *  instead it replaces the existing string value with the sequence of characters of array.*/
			
			System.out.println("===============copyValueOf()===========");
			
			char[] data= {'u','p','e','n','d','e','r','t','a','d','e','w','a','r'};
			
			String strone="tadewar bns tg";
			System.out.println(strone.copyValueOf(data));
			
			String strtwo="abc";
			System.out.println(strtwo.copyValueOf(data, 0, 14));
			
			
	}

}
