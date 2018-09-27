 package StringPkgDemo;

public class StringMethodsDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("=============matches() method============");
		
		String str="java string methods";
		
		System.out.println(str.matches("(.*).string(.*)"));
		
		System.out.println(str.matches("(.*)demo(.*)"));
		
		System.out.println(str.matches("(.*)methods"));
		
		
		System.out.println("=============regionMatches()===========");
		
		/*The method regionMatches() tests if the two Strings are equal. Using this method we can compare the substring of input String with the substring of specified String.*/
		
		String str1="Hello, How are you ?";
		
		System.out.println(str1.indexOf("How"));
		
		
		System.out.println(str1.regionMatches(7, "How", 0, 3));
		System.out.println(str1.regionMatches(7, "HOW", 0, 3));
		System.out.println(str1.regionMatches(true, 7,"HOW", 0, 3));
		
		
		System.out.println("====================contentEquals()===============");
		
		/*The method contentEquals() compares the String with the String Buffer and returns a boolean value.
		 *  It returns true if the String matches to the String buffer else it returns false.*/
		
		String strOne="first string";
		String strTwo="second string";
		String strr="first string";
		StringBuffer strThree=new StringBuffer("second string");
		StringBuffer strFour= new StringBuffer("first string");
		
		System.out.println(strOne.contentEquals(strThree));
		System.out.println(strOne.contentEquals(strFour));
		
		System.out.println(strTwo.contentEquals(strThree));
		System.out.println(strTwo.contentEquals(strFour));
		
		System.out.println(strOne.contentEquals(strr));
		
		
		System.out.println("=======toCharArray()=============");
		
		char ch[] = strOne.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}
		
		
	}

}
