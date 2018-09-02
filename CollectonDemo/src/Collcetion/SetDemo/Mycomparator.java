package Collcetion.SetDemo;

import java.util.Comparator;
import java.util.TreeSet;

class EMP
{
	Integer empNo;
	String empName;
	
	@Override
	public String toString() {
		return "EMP [empNo=" + empNo + ", empName=" + empName + "]";
	}

	public EMP(Integer empNo, String empName) {
	
		this.empNo = empNo;
		this.empName = empName;
	}
}


public class Mycomparator implements Comparator<EMP>
	{
	
	@Override
	public int compare(EMP e1, EMP e2) {
		
		//1. default sorting order
		
		Integer I1 =e1.empNo;
		Integer I2=e2.empNo;
		
	//	return I1.compareTo(I2);  
//[[EMP [empNo=10001, empName=UPENDER], EMP [empNo=22222, empName=plo], EMP [empNo=33333, empName=def], EMP [empNo=87777, empName=jjj], EMP [empNo=99999, empName=abc]]

		
		//2. Descending order
		
	/*	return I2.compareTo(I1);
		
[EMP [empNo=99999, empName=abc], EMP [empNo=87777, empName=jjj], EMP [empNo=33333, empName=def], EMP [empNo=22222, empName=plo], EMP [empNo=10001, empName=UPENDER]]
		*/
		
		//3.Descending order
	/*	return -I1.compareTo(I2); 
		
		[EMP [empNo=99999, empName=abc], EMP [empNo=87777, empName=jjj], EMP [empNo=33333, empName=def], EMP [empNo=22222, empName=plo], EMP [empNo=10001, empName=UPENDER]]
		*/
		
		//4 Ascending order
		
		/*return -I2.compareTo(I1);
		[EMP [empNo=10001, empName=UPENDER], EMP [empNo=22222, empName=plo], EMP [empNo=33333, empName=def], EMP [empNo=87777, empName=jjj], EMP [empNo=99999, empName=abc]]
		
		*/
		
		//5. insertion order
		
	/*	return +1;
		
		[EMP [empNo=10001, empName=UPENDER], EMP [empNo=99999, empName=abc], EMP [empNo=33333, empName=def], EMP [empNo=22222, empName=plo], EMP [empNo=87777, empName=jjj], EMP [empNo=10001, empName=nnn], EMP [empNo=33333, empName=lllll]]

		*/
		
		//Reverse of insertion order
		/*
		return -1;
		
		[EMP [empNo=33333, empName=lllll], EMP [empNo=10001, empName=nnn], EMP [empNo=87777, empName=jjj], EMP [empNo=22222, empName=plo], EMP [empNo=33333, empName=def], EMP [empNo=99999, empName=abc], EMP [empNo=10001, empName=UPENDER]]
*/
		//Only first element
		
		return 0;
		
		// [EMP [empNo=10001, empName=UPENDER]]

		
	}
	
	
	public static void main(String[] args) {
		
		TreeSet<EMP> t1 = new TreeSet<>(new Mycomparator());
		
		
		EMP e1 = new EMP(10001, "UPENDER");
		EMP e2 = new EMP(99999, "abc");
		EMP e3 = new EMP(33333, "def");
		EMP e4 = new EMP(22222, "plo");
		EMP e5 = new EMP(87777, "jjj");
		EMP e6 = new EMP(10001, "nnn");
		EMP e7 = new EMP(33333, "lllll");
		
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		t1.add(e6);
		t1.add(e7);
		
		System.out.println(t1);
		
	}
	
	}
