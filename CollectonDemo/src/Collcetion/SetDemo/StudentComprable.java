package Collcetion.SetDemo;

import java.util.Iterator;
import java.util.TreeSet;

@SuppressWarnings("rawtypes")
public class StudentComprable extends StudentsMarks implements Comparable {
	public StudentComprable(Integer marks, String name, Integer rollno) {
		super(marks, name, rollno);
		// TODO Auto-generated constructor stub
	}


	@Override
	public int compareTo(Object o) {
		
		StudentsMarks studentObj=(StudentsMarks)o;
		Integer marks1=studentObj.marks;
		Integer marks2=this.marks;
		if (marks1>marks2) {
			return +1;
			
		}else if (marks1<marks2) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
	public static void main(String[] args) {
		
		StudentsMarks s1=new StudentComprable(777, "abc", 12345);
		StudentsMarks s2=new StudentComprable(890, "xyz", 12346);
		StudentsMarks s3=new StudentComprable(540, "lmn", 12347);
		StudentsMarks s4=new StudentComprable(998, "pqr", 12348);
		StudentsMarks s5=new StudentComprable(450, "dlf", 12349);
		
		TreeSet<StudentsMarks> smarks= new TreeSet<>() ;
		smarks.add(s1);
		smarks.add(s2);
		smarks.add(s3);
		smarks.add(s4);
		smarks.add(s5);
		
		
		
		for (Iterator iterator = smarks.iterator(); iterator.hasNext();) {
			StudentsMarks studentsMarks = (StudentsMarks) iterator.next();
			
			System.out.println("Sname :"+studentsMarks.name+":"+"SRollno :"+studentsMarks.rollno+": SMarks :"+studentsMarks.marks);
		}
	}

	
		
		
		
	

}
