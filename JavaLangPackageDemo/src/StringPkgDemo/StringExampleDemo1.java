package StringPkgDemo;

public class StringExampleDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("conver string to int/Integer");
		
		String string = "12345";
		
		int i=Integer.parseInt(string);
		
		Integer I=Integer.valueOf(string);
		
		int i1= Integer.valueOf(string);
		
		System.out.println(i);
		System.out.println(I);
		System.out.println(i1);

		String str1="abc";
		
		//int Int=Integer.parseInt(str1);java.lang.NumberFormatException
		
	//	Integer integer=Integer.valueOf(str1);//java.lang.NumberFormatException:
		
		String string1="012348";
		int intval=Integer.parseInt(string1)+100;
		
		System.out.println(intval);
		
	String st2=	String.format("%08d", intval);
	
	System.out.println("padding zeros :"+st2);
	
	
	}

}
