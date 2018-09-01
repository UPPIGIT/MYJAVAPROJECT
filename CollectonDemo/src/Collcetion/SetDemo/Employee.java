package Collcetion.SetDemo;
import java.util.HashSet;

public class Employee {
	
	Integer empNo;
	String  empName;
	String company;
	
	public Employee(Integer empNo, String empName, String company) {
		
		this.empNo = empNo;
		this.empName = empName;
		this.company = company;
	}
	
	public Integer getEmpNo() {
		return empNo;
	}


	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		if (getEmpNo()==null) {
			return 1;
			
		}
		return getEmpNo();
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Employee) {
			
			Employee emp=(Employee)obj;
			
			System.out.println("emp   :" +emp.empNo);
			System.out.println("getEmpNo :" +getEmpNo());
			
		
			
			if (getEmpNo()==null) {
				
				return true;
				
			}
			
			if (emp.empNo.equals(getEmpNo())){
				return true;
				
				
			
			} else {
					return false;
			}
			
		}
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getEmpNo()+":"+getEmpName()+":"+getCompany();
	}

	public static void main(String[] args) {
		
		
		
		Employee e1= new Employee(1111,"UPENDER" ,"CTS" );
		Employee e2= new Employee(2222,"SRUTHI" ,"CTS" );
		Employee e3= new Employee(3333,"RISHI" ,"CTS" );
		Employee e4= new Employee(null,"MANI" ,"CTS" );
		Employee e5= new Employee(1111,"UPPP" ,"CTS" );
		Employee e6= new Employee(5555, "SATWIK", "CTS");
		Employee e7= new Employee(5555, "SATWIK", "TCS");
		Employee e8= new Employee(null, "SATWIK", "TCS");
		Employee e9=e4;
		
		HashSet<Employee> hs= new HashSet<>();
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		hs.add(e6);
		hs.add(e7);
		hs.add(e8);
		hs.add(e9);
		
		
		System.out.println(hs);
	}

}
