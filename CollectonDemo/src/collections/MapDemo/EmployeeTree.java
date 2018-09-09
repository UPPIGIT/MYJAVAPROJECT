package collections.MapDemo;

import java.util.Random;

public class EmployeeTree implements Comparable<EmployeeTree> {
	
	Integer empId;
	String empName;
	Integer empSal;
	
	
	
	public EmployeeTree(Integer empId, String empName, Integer empSal) {
	
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public EmployeeTree() {
		
		String alphabet="upendersruthimanisatwikrishi";
		Integer N= alphabet.length();
		
		Random r = new Random();
		
		StringBuffer name= new StringBuffer();
		
		for (int i = 0; i < 5; i++) {
			
			name.append(alphabet.charAt(r.nextInt(N)));
			
			
			
		}
		
		this.empName=name.toString();
		
		this.empId=r.nextInt(999)*48+4;
		this.empSal=r.nextInt(9999)*52+1;
	}

	@Override
	public String toString() {
		return "EmployeeTree [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	@Override
	public int compareTo(EmployeeTree o) {
		
		Integer emp1=o.empId;
		Integer emp2=empId;
		
		
		return emp2.compareTo(emp1);
	}


}
