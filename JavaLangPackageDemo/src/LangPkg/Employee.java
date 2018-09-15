package LangPkg;

public class Employee {
	
	String empName;
	Integer eId;
	Float eSal;
	
	

	public Employee(String empName, Integer eId, Float eSal) {
		
		this.empName = empName;
		this.eId = eId;
		this.eSal = eSal;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return eId;
	}

	


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", eId=" + eId + ", eSal=" + eSal + "]";
	}


	public static void main(String[] args) {
		
		Employee e1= new Employee("UPENDER", 10, (float) 4578.45);
		
		Employee e2 = new Employee("Risho", 100, (float) 7894.56);
		
		System.out.println(e1);
		System.out.println(e2);
	}

}


/*with out toString() override
LangPkg.Employee@4aa8f0b4
LangPkg.Employee@9e89d68
*/


/*with hashCode() overide

LangPkg.Employee@a
LangPkg.Employee@64*/


/*with toString() method
Employee [empName=UPENDER, eId=10, eSal=4578.45]
Employee [empName=Risho, eId=100, eSal=7894.56]*/
