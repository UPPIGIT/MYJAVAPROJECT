package Collcetion.SetDemo;

public class StudentsMarks {
	
	Integer marks;
	String name;
	Integer rollno;
	
	public StudentsMarks(Integer marks, String name, Integer rollno) {
	
		this.marks = marks;
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "StudentsMarks [marks=" + marks + ", name=" + name + ", rollno=" + rollno + "]";
	}
	
	

}
