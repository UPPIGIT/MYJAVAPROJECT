package collection.ArrayListDemo;
import java.util.ArrayList;

class Customer
{
	
	Integer cusno;
	String cusname;
	
	public Customer(Integer cusno ,String cusname) {
		this.cusname=cusname;
		this.cusno=cusno;
	}
}


class EMP
{
	
	Integer empno;
	String empname;

	public EMP(Integer empno, String empname) {
		
		this.empname=empname;
		this.empno=empno;
	
	}
}

public class ArrayListMethode9 {
	public static void main(String[] args) {
		
		ArrayList<Object> AL = new ArrayList<>();
		
		Customer c1 = new Customer(101, "Upender");
		Customer c2 = new Customer(102, "Pichi");
		
		EMP e1 = new EMP(1001, "potti");
		EMP e2 = new EMP(1005, "sruthi");
		
		AL.add(e1);
		AL.add(c1);
		AL.add(e2);
		AL.add(c2);
		
		Object[] array = AL.toArray();
		
		for (Object object2 : array) {
			
			if (object2 instanceof Customer)
			{
				
				Customer cs=(Customer)object2;
				
				System.out.println(cs.cusname);
				System.out.println(cs.cusno);
			}
			
			else {
				
				EMP ep =(EMP)object2;
				

				System.out.println(ep.empname);
				System.out.println(ep.empno);
			}
		}
		
		
	}

}
