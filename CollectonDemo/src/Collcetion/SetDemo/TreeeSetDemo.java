package Collcetion.SetDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeeSetDemo implements Comparator<Integer>{
	
	@Override
	public int compare(Integer o1, Integer o2) {
		
		if (o1>o2) {
			return +1;
			
		}else if(o1<o2){
			return -1;
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts= new TreeSet<>();//Note : default natural sorting order.JVM casll Integre class compareTo method for sorting
		ts.add(77);
		ts.add(1);
		ts.add(99);
		ts.add(22);
		ts.add(32);
		ts.add(44);
		ts.add(32);
		
		System.out.println(ts);//[1, 22, 32, 44, 77, 99]
		
		TreeSet<Integer> ts1= new TreeSet<>(new TreeeSetDemo());//here we are passing comparator object .so,Jvm call the compare()method. which meants for cutomized sorting order
		ts1.addAll(ts);
		
		System.out.println(ts1);
		
		
	}

	

}
