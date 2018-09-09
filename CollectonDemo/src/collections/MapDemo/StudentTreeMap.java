package collections.MapDemo;

import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class StudentTreeMap {
	


	public static void main(String[] args) {
		
		TreeMap<StudentDetails, StudentMarks> studentTreeMap= new TreeMap<>(new StudentDetails());
		
		for (int i = 0; i < 5; i++) {
			
			studentTreeMap.put(new StudentDetails(i+100+1), new StudentMarks(i+100+1));
			
		}
		
		Set<Entry<StudentDetails, StudentMarks>> entrySet=studentTreeMap.entrySet();
		Iterator<Entry<StudentDetails, StudentMarks>> itr= entrySet.iterator();
		
		while (itr.hasNext()) {
			Map.Entry<collections.MapDemo.StudentDetails, collections.MapDemo.StudentMarks> entry = (Map.Entry<collections.MapDemo.StudentDetails, collections.MapDemo.StudentMarks>) itr
					.next();
			
			System.out.println(entry.getKey()+"................."+entry.getValue());
			
		}
	}
}
