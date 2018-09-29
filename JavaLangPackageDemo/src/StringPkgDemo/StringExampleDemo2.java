package StringPkgDemo;

public class StringExampleDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("String to primitive conversion using paseXXX() method");
	
	String string1="1234";
	
	
	//byte b=Byte.parseByte(string1);//java.lang.NumberFormatException: Value out of range. Value:"1234" Radix:10
	short s=Short.parseShort(string1); 
	int i=Integer.parseInt(string1);
	long l=Long.parseLong(string1);
	float f=Float.parseFloat(string1);
	double d=Double.parseDouble(string1);
	boolean bln=Boolean.parseBoolean(string1);
	//char c= Character..pa
	
	System.out.println(s);
//	System.out.println(b);
	System.out.println(l);
	System.out.println(f);
	System.out.println(d);
	System.out.println(bln);
	System.out.println(i);
	
	System.out.println("String to wrapper calls object conversion using valueOf(string str) method");
	
	//Byte B= Byte.valueOf(string1); java.lang.NumberFormatException: Value out of range. Value:"1234" Radix:10
	Short S=Short.valueOf(string1);
	Integer I= Integer.valueOf(string1);
	Long L=Long.valueOf(string1);
	Float F= Float.valueOf(string1);
	Double D= Double.valueOf(string1);
	Boolean BLN=Boolean.valueOf(string1);
	
	System.out.println(S);
	System.out.println(I);
	System.out.println(L);
	System.out.println(F);
	System.out.println(D);
	System.out.println(BLN);
	
	String strbln1="true";
	String strbln2="false";
	String strbln3="True";
	String strbln4="False";
	String strbln5="TRUE";
	String strbln6="FLASE";
	String strbln7="tRue";
	String strbln8="fAlse";
	
	String strbln9="abcd";
	
	System.out.println("String to boolean primitive conversion");
	System.out.println(Boolean.parseBoolean(strbln1));
	System.out.println(Boolean.parseBoolean(strbln2));
	System.out.println(Boolean.parseBoolean(strbln3));
	System.out.println(Boolean.parseBoolean(strbln4));
	System.out.println(Boolean.parseBoolean(strbln5));
	System.out.println(Boolean.parseBoolean(strbln6));
	System.out.println(Boolean.parseBoolean(strbln7));
	System.out.println(Boolean.parseBoolean(strbln8));
	System.out.println(Boolean.parseBoolean(strbln9));
	
	
	System.out.println("String to Boolean wrapperclass conversion");
	System.out.println(Boolean.valueOf(strbln1));
	System.out.println(Boolean.valueOf(strbln2));
	System.out.println(Boolean.valueOf(strbln3));
	System.out.println(Boolean.valueOf(strbln4));
	System.out.println(Boolean.valueOf(strbln5));
	System.out.println(Boolean.valueOf(strbln6));
	System.out.println(Boolean.valueOf(strbln7));
	System.out.println(Boolean.valueOf(strbln8));
	System.out.println(Boolean.valueOf(strbln9));

	
	
	
	
	
	

	}

}
