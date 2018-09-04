package collections.MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class EmpDeptHashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Employee, DepartMent> empDptHashMap= new HashMap<>();
		
		for (int i = 0; i < 5; i++) {
			
			empDptHashMap.put(new Employee(), new DepartMent());
			
		}
		
		empDptHashMap.put(new Employee(436185, "upender", 800000), new DepartMent(1120, "IT"));
		empDptHashMap.put(new Employee(436185, "upender", 1200000), new DepartMent(1320, "IT"));
		
		empDptHashMap.put(new Employee(778899, "sruthi", 700000), new DepartMent(1120, "IT"));
		empDptHashMap.put(new Employee(778899, "sruthi", 130000), new DepartMent(1120, "IT"));
		
		
		
		System.out.println(empDptHashMap);
		
		System.out.println("\n");
		
		System.out.println("***********************Entry set iteration*********************");
		System.out.println("\n");
		
		Set<Entry<Employee, DepartMent>> empdeptEntrySet= empDptHashMap.entrySet();
		
		Iterator<Entry<Employee, DepartMent>> empDeptItr= empdeptEntrySet.iterator();
		 
		
		
		
		while (empDeptItr.hasNext()) {
			Map.Entry<collections.MapDemo.Employee, collections.MapDemo.DepartMent> entry = (Map.Entry<collections.MapDemo.Employee, collections.MapDemo.DepartMent>) empDeptItr
					.next();
			
			System.out.println(entry.getKey()+ " "+entry.getValue());
			
			
		}
	}

}
