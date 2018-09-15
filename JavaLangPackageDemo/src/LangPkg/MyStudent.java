package LangPkg;

public class MyStudent {
	
	String stName;
	Integer rollNo;
	
	

	public MyStudent(String stName, Integer rollNo) {
		this.stName = stName;
		this.rollNo = rollNo;
	}
	
	// 1
	
/*	@Override
	public boolean equals(Object obj) {
		
		Integer rollno1=rollNo;
		
		MyStudent mystu=(MyStudent)obj;
		
		Integer rollno2= mystu.rollNo;
		
		return rollno1.equals(rollno2);
		
	}*/
	
	//2
	
/*	@Override
	public boolean equals(Object obj) {
	
		try {
			
			Integer rollno1=rollNo;
			
			MyStudent mystu=(MyStudent)obj;
			
			Integer rollno2= mystu.rollNo;
			
			if (rollno1.equals(rollno2)) {
				return true;
				
			} else {
				return false;
			}
			
		} catch (ClassCastException ce) {
			return false;
		}catch (NullPointerException e) {
			return false;
		}
	}*/

	//3
	
/*	@Override
	public boolean equals(Object obj) {
		
		try {
			
			MyStudent st1= (MyStudent)obj;
			
			if (rollNo.equals(st1.rollNo)) {
				return true;
			} else {
				return false;
			}
			
		} catch (ClassCastException e) {
			return false;
		}catch (NullPointerException e) {
			return false;
		}
	}
*/
	
	//4.
	
/*	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyStudent) {
			
			MyStudent student=(MyStudent)obj;
			
			if (rollNo.equals(student.rollNo) ){
				return true;
			} else {
				return false;
			}
			
		} else {
			return false;
		}
	}*/
	
	//5
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof MyStudent) {
			
			MyStudent obj1=(MyStudent)obj;
			
			if (obj1.rollNo==this.rollNo) {
				return true;
			} else {
				return false;
			}
			
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
			
		MyStudent s1= new MyStudent("upender", 101);
		MyStudent s2= new MyStudent("upender", 101);
		MyStudent s3= new MyStudent("potti", 102);
		MyStudent s4= new MyStudent("potti", 102);
		MyStudent s5=s1;
		
		
		
		System.out.println(s1.equals(s2)); 
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		
    	String s6= new String("Upender");
		
		System.out.println(s1.equals(s6));//java.lang.ClassCastException
		
	    System.out.println(s1.equals(null));//java.lang.NullPointerException
		
		
		

	}

}
