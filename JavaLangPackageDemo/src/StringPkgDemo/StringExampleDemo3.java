package StringPkgDemo;

public class StringExampleDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("========Primitive to String conversion using String value of method========");
		
		byte b=10;
		short s=123;
		int i=100;
		long l=1745;
		float f= 47.56f;
		double d=58.78;
		char c='U';
		boolean bln=true;
		
		String byteStr=String.valueOf(b);
		String shortStr=String.valueOf(s);
		String intStr=String.valueOf(i);
		String longStr=String.valueOf(l);
		String floatStr=String.valueOf(f);
		String doubleStr=String.valueOf(d);
		String charStr=String.valueOf(c);
		String blnStr=String.valueOf(bln);
		
		System.out.println(byteStr);
		System.out.println(shortStr);
		System.out.println(intStr);
		System.out.println(longStr);
		System.out.println(floatStr);
		System.out.println(doubleStr);
		System.out.println(charStr);
		System.out.println(blnStr);
		
		System.out.println("========Primitive to String conversion using toString() method========");
		
		System.out.println(Byte.toString(b));
		System.out.println(Short.toString(s));
		System.out.println(Integer.toString(i));
		System.out.println(Long.toString(l));
		System.out.println(Float.toString(f));
		System.out.println(Double.toString(d));
		System.out.println(Boolean.toString(bln));
		
		
		
		
		
		

	}

}
