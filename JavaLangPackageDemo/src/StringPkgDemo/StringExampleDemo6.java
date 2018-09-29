package StringPkgDemo;

public class StringExampleDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="MyString";
		
		String str1=String.format("%1$-10s", str);
		System.out.println(str1+"@@@@");
		
		String str2=String.format("%1$-10s", str).replace(' ', '0');
		System.out.println(str2);

	}

}
