package collections.MapDemo;

import java.util.Random;

public class Employee {
	
	private Integer empId;
	private String empName;
	private Integer salary;
	



	public Employee(Integer empId, String empName, Integer salary) {
	
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
		
	//generate random names
		String Alphabet="upendersruthirishimanisatwiksumanrajaram";
		int N= Alphabet.length();
		
		StringBuffer name= new StringBuffer();
		Random r= new Random();
		
		for (int i = 0; i < 5; i++) {
			
			name.append(Alphabet.charAt(r.nextInt(N)));
		}
		
		//random salary
		Integer salary;
		salary=r.nextInt(9999)*44;
		
		//random empid
		
		Integer empId;
		empId =r.nextInt(999)+17;
		
		
		this.empName=name.toString();
		this.salary=salary;
		this.empId=empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}

	
	
	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		
		return getEmpId();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		System.out.println("emp equlas method");
		Employee empObj= (Employee)obj;
		
		if (empObj.empId.equals(getEmpId()) ) {
			
			empObj.salary=getSalary();
		}
		
		
		return empObj.empId.equals(getEmpId()) ;
	}

	public static void main(String[] args) {
		
		Employee emp= new Employee();
		
		System.out.println(emp);
	
	}

}
