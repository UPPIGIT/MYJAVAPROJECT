package LangPkg;

import java.util.ArrayList;

public class toStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		Note : All wrapper classes ,collection classes ,String ,String buffer ,String builder classes toString() method is overriden for 
		meaningful string represention*/
		
		String s1 = new String("Upender");
		System.out.println(s1);
		
		Integer I1= 1000;
		System.out.println(I1);
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(200);
		
		System.out.println(al);
		
		Test test= new Test(1000);// If our class doesn't contains toString() method then Object class toString() method will be executed
		System.out.println(test);//Test@9e89d68
		

	}

}

class Test
{
 int i;
 
 public Test(int i) {
	 
	 this.i=i;
	
}

}
