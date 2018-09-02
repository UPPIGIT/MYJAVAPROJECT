package Collcetion.SetDemo;

import java.util.Comparator;
import java.util.TreeSet;

@SuppressWarnings("rawtypes")
public class Department implements Comparator {
	
	String deptName;
	Integer deptNo;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(String deptName, Integer deptNo) {
	
		this.deptName = deptName;
		this.deptNo = deptNo;
	}


	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		System.out.println("My compare method");
		Department dept1=(Department)o1;
		Department dept2=(Department)o2;
		
		if (dept2.deptNo<dept1.deptNo) {
		
			return -1;
			
		}else if (dept2.deptNo>dept1.deptNo) {
		;
			
			return +1;
			
		}
		
		else {
		
			return 0;
		}
	}
	

	
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", deptNo=" + deptNo + "]";
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		TreeSet ts= new TreeSet<>(new Department() );
		
		Department d1= new Department("abc",1234);
		Department d2= new Department("lmn",5678);
		Department d3= new Department("xyz",1122);
		Department d4= new Department("aaa",5897);
		Department d5= new Department("bbb",1234);
		Department d6= new Department("ccc",1111);
		
		ts.add(d1);
		ts.add(d2);
		ts.add(d3);
		ts.add(d4);
		ts.add(d5);
		ts.add(d6);
		
		System.out.println(ts);
		
	}

}
