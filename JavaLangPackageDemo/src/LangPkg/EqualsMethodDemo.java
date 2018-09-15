package LangPkg;

public class EqualsMethodDemo {

	public static void main(String[] args) {
		
	/*Object class	equals() method meant for refrence comparison
	String class overriden the equals() method to compare content
	wrapper overriden the equals() method to compare content
	StringBuffer and String Builder class equals() method not overriden*/
		
		String s1= new String("Upender");
		String s2 = new String("Sruthi");
		String s3=new String("Upender");
		String s4 = new String("Sruthi");
		
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//false
		System.out.println(s2.equals(s4));//true
		
		Integer I1=100;
		Integer I2=200;
		Integer I3=200;
		Integer I4=100;
		
		System.out.println(I1.equals(I2));
		System.out.println(I1.equals(I3));
		System.out.println(I2.equals(I3));
		System.out.println(I1.equals(I4));
		
	
		StringBuffer sb1= new StringBuffer("ABC");
		StringBuffer sb2= new StringBuffer("ABC");
		
		System.out.println(sb1.equals(sb2));
		
		StringBuilder SB1= new StringBuilder("ABC");
		StringBuilder SB2= new StringBuilder("ABC");
		
		System.out.println(SB1.equals(SB2));
	}

}
