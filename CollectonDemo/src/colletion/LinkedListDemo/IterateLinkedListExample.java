package colletion.LinkedListDemo;

import java.util.LinkedList;
import java.util.ListIterator;

class EMPLOYEE
{
	Integer eno;
	String ename;
	public EMPLOYEE(Integer eno ,String ename) {
		
		
		this.eno=eno;
		this.ename=ename;
	}
	
}

class CUSTOMER
{
	Integer cusno;
	String cusname;
	public CUSTOMER(Integer cusno, String cusname) {
		this.cusname=cusname;
		this.cusno=cusno;
	}
}
public class IterateLinkedListExample {

	public static void main(String[] args) {
		
		EMPLOYEE e1 = new EMPLOYEE(101, "Upender");
		EMPLOYEE e2 = new EMPLOYEE(102, "POTTI");
				
		CUSTOMER c1 = new CUSTOMER(103, "SRUTHI");
		CUSTOMER c2 = new CUSTOMER(104, "ABC");
		
		LinkedList<Object> ll = new LinkedList<>();
		
		ll.add(e1);
		ll.add(e2);
		ll.add(c1);
		ll.add(c2);
		
		ListIterator<Object> ltr = ll.listIterator();
		
		while(ltr.hasNext())
		{
			Object object =ltr.next();
			if (object instanceof EMPLOYEE)
			{
				
			EMPLOYEE employee =(EMPLOYEE) object;
			
			System.out.println(employee.ename);
			System.out.println(employee.eno);
				
			}
			
			else
			{
				CUSTOMER customer =(CUSTOMER)object;
				
				System.out.println(customer.cusname);
				System.out.println(customer.cusno);
				
				
			}
			
		}
		
	
		
		
	}
}
