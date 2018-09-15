package LangPkg;

public class Student {
	
	String stName;
	Integer stRollNo;
	Integer stMarks;


	

	public Student(String stName, Integer stRollNo, Integer stMarks) {
		
		this.stName = stName;
		this.stRollNo = stRollNo;
		this.stMarks = stMarks;
	}


		


	@Override
	public String toString() {
		return "Student [stName=" + stName + ", stRollNo=" + stRollNo + ", stMarks=" + stMarks + "]";
	}





	public static void main(String[] args) {
	
		Student s1 = new Student("Upender", 1001, 507);
		
		System.out.println(s1);//with out toString() method op is LangPkg.Student@4aa8f0b4
		
		//With toString() method Student [stName=Upender, stRollNo=1001, stMarks=507]

	}

}
