package collections.MapDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EmpDeptTreeMapDemo {
	


	public static void main(String[] args) {

			TreeMap<EmployeeTree, DepartMent> treeMap= new TreeMap<>();
			
			for (int i = 0; i < 5; i++) {
				
				treeMap.put(new EmployeeTree(), new DepartMent());
				
			}
			
			treeMap.put(new EmployeeTree(101, "upender", 850000), new DepartMent(1002, "IT"));
			treeMap.put(new EmployeeTree(101, "upender", 850000), new DepartMent(1003, "Techinal con"));//value overrided with new value
			
		Set<Entry<EmployeeTree, DepartMent>> entry=	treeMap.entrySet();
		
		Iterator<Entry<EmployeeTree, DepartMent>> itr= entry.iterator();
		
		while (itr.hasNext()) {
			Map.Entry<collections.MapDemo.EmployeeTree, collections.MapDemo.DepartMent> entry2 = (Map.Entry<collections.MapDemo.EmployeeTree, collections.MapDemo.DepartMent>) itr
					.next();
			
			System.out.println(entry2.getKey()+"............."+entry2.getValue());
		}
			
		
	
			
			
			
	}



}
