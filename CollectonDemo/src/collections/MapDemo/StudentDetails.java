package collections.MapDemo;

import java.util.Comparator;
import java.util.Random;

public class StudentDetails implements Comparator<StudentDetails>{
	
	Integer stRollNo;
	String stName;
	
	public StudentDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentDetails(Integer stRollNo) {
		
		String alphabet="upenderrishisruthisrikarmanisatwik";
		Integer N=alphabet.length();
		
		StringBuffer name=new StringBuffer();
		
		Random r = new Random();
		
		for (int i = 0; i <5; i++) {
			
			name.append(alphabet.charAt(r.nextInt(N)));
		
			
		}
		
		this.stName=name.toString();
		this.stRollNo=stRollNo;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return stRollNo;
	}

	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		
		return o1.stRollNo.compareTo(o2.stRollNo);
	}

	@Override
	public String toString() {
		return "StudentDetails [stRollNo=" + stRollNo + ", stName=" + stName + "]";
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(new StudentDetails(i));
			
		}
	}

}
