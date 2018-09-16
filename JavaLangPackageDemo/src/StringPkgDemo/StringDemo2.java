package StringPkgDemo;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= new String();
		String s2="test";
		s1=s2;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		
		String st1=new String("test");
		String st2="durga";
		st1=st2;
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st1==st2);
		st2=st1;
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st1==st2);
	}

}
