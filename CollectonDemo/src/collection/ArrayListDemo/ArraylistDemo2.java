package collection.ArrayListDemo;
import java.util.ArrayList;

class Employee
{
	Integer empno;
	String ename;
	
	public Employee(Integer empno, String ename) {
		// TODO Auto-generated constructor stub
		this.empno=empno;
		this.ename = ename;
		
	}
}
public class ArraylistDemo2 {
	public static void main(String[] args) {
		
		ArrayList al =new ArrayList<>();
		Employee e= new Employee(101, "Upender");
		Employee e1= new Employee(102, "POTTI");
		Employee e3 =new Employee(103, "XYZ");
		
		al.add(e);
		al.add(e1);
		al.add(e3);
		
		System.out.println(al);
		
		Employee ee= (Employee) al.get(1);
		
		System.out.println(ee.ename);
	}

}
