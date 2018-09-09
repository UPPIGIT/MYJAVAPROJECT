package collections.MapDemo;

import java.util.Random;

public class StudentMarks {
	
	Integer stRollNo;
	Integer stMarks;
	
	public StudentMarks(Integer stRollno)
	{
		
		
		this.stRollNo=stRollno;
		
		this.stMarks=new Random().nextInt(1000);
	}
	


	@Override
	public String toString() {
		return "StudentMarks [stRollNo=" + stRollNo + ", stMarks=" + stMarks + "]";
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(new StudentMarks(i));
			
		}

}
}