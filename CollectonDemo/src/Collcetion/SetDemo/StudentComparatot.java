package Collcetion.SetDemo;

import java.util.Comparator;
import java.util.TreeSet;

@SuppressWarnings("rawtypes")
public class StudentComparatot implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		StudentsMarks obj1=(StudentsMarks)o1;
		StudentsMarks obj2=(StudentsMarks)o2;
		
		if (obj2.marks>obj1.marks) {
			return -1;
		}else if (obj2.marks<obj1.marks) {
			return +1;
			
		}else {return 0;}
	}
	

	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		StudentsMarks s1=new StudentsMarks(777, "abc", 12345);
		StudentsMarks s2=new StudentsMarks(890, "xyz", 12346);
		StudentsMarks s3=new StudentsMarks(540, "lmn", 12347);
		StudentsMarks s4=new StudentsMarks(998, "pqr", 12348);
		StudentsMarks s5=new StudentsMarks(450, "dlf", 12349);
		
		TreeSet<StudentsMarks> smarks= new TreeSet<>(new StudentComparatot()) ;
		smarks.add(s1);
		smarks.add(s2);
		smarks.add(s3);
		smarks.add(s4);
		smarks.add(s4);
		smarks.add(s5);
		
		System.out.println(smarks);
	}

}
