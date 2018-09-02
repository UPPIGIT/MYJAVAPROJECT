package Collcetion.SetDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	TreeSet<FligthTimings> timingsTree=new TreeSet<>(new FligthTimings());
		
		for (int i = 1; i <= 7; i++) {
			
			FligthTimings timings=new FligthTimings("H101"+i, 10235+i, (float) (00.01*i*3));
			
			timingsTree.add(timings);
		}

		Iterator<FligthTimings> itr= timingsTree.iterator();
		
		while (itr.hasNext()) {
			FligthTimings fligthTimings = (FligthTimings) itr.next();
			
			System.out.println(fligthTimings);
		}
		
	System.out.println("===========================================================");	
	System.out.println("lower : "+timingsTree.lower(new FligthTimings("H", 10123, 0.11f)));//Returns greatest element in this set which is strictly less than the given element.
	
	System.out.println("floor : "+timingsTree.floor(new FligthTimings("H", 10123, 0.11f)));//	Returns greatest element in this set which is less than or equal to the given element
	System.out.println("floor : "+timingsTree.floor(new FligthTimings("H", 10123, 0.12f)));
	
	System.out.println("higher : "+timingsTree.higher(new FligthTimings("H", 10123, 0.12f)));//	Returns the least element in this set which is strictly greater than the given element.
	
	System.out.println("ceiling : "+timingsTree.ceiling(new FligthTimings("H", 10123, 0.11f)));//	Returns the least element in this set which is greater than or equal to the given element.
	System.out.println("ceiling : "+timingsTree.ceiling(new FligthTimings("H", 10123, 0.12f)));
	
	System.out.println("descending set");
	
	Set<FligthTimings> desset=timingsTree.descendingSet();
	
	System.out.println(desset);
	
	System.out.println("descending Iteratot");
	
	Iterator<FligthTimings> deitr=timingsTree.descendingIterator();
	
	while (deitr.hasNext()) {
		FligthTimings fligthTimings = (FligthTimings) deitr.next();
		System.out.println(fligthTimings);
		
	}
	
	System.out.println("Subset.............");
	Set<FligthTimings> subset=timingsTree.subSet(new FligthTimings("H", 10123, 0.03f),true, new FligthTimings("H", 10123, 0.12f),true);
	
	Iterator<FligthTimings> subitr=subset.iterator();
	
	while (subitr.hasNext()) {
		FligthTimings fligthTimings = (FligthTimings) subitr.next();
		System.out.println(fligthTimings);
		
	}
		
	System.out.println("HeadSet..................");
	
	Set<FligthTimings> headset=timingsTree.headSet(new FligthTimings("H", 10123, 0.12f),true);
	
	Iterator<FligthTimings> headSetItr=headset.iterator();
	
	while (headSetItr.hasNext()) {
		FligthTimings fligthTimings = (FligthTimings) headSetItr.next();
		
		System.out.println(fligthTimings);
		
	}
	
	System.out.println("Tailset...........");
	
	Set<FligthTimings> tailset=timingsTree.tailSet(new FligthTimings("H", 10123, 0.12f));
	
	Iterator<FligthTimings> tailSetItr=tailset.iterator();
	
	while (tailSetItr.hasNext()) {
		FligthTimings fligthTimings = (FligthTimings) tailSetItr.next();
		
		System.out.println(fligthTimings);
		
	}
	
	System.out.println("pollfirst :"+timingsTree.pollFirst());//	Retrieves and removes the first element in this set.
	System.out.println(timingsTree);
	
	System.out.println("polllast :"+timingsTree.pollLast());//	Retrieves and removes last element in this set.
	System.out.println(timingsTree);
	}
	
	
}

/* [flightName=H1011, flightNum=10236, time=0.03]
 [flightName=H1012, flightNum=10237, time=0.06]
 [flightName=H1013, flightNum=10238, time=0.09]
 [flightName=H1014, flightNum=10239, time=0.12]
 [flightName=H1015, flightNum=10240, time=0.15]
 [flightName=H1016, flightNum=10241, time=0.18]
 [flightName=H1017, flightNum=10242, time=0.21]
===========================================================
lower :  [flightName=H1013, flightNum=10238, time=0.09]
floor :  [flightName=H1013, flightNum=10238, time=0.09]
floor :  [flightName=H1014, flightNum=10239, time=0.12]
higher :  [flightName=H1015, flightNum=10240, time=0.15]
ceiling :  [flightName=H1014, flightNum=10239, time=0.12]
ceiling :  [flightName=H1014, flightNum=10239, time=0.12]
descending set
[ [flightName=H1017, flightNum=10242, time=0.21],  [flightName=H1016, flightNum=10241, time=0.18],  [flightName=H1015, flightNum=10240, time=0.15],  [flightName=H1014, flightNum=10239, time=0.12],  [flightName=H1013, flightNum=10238, time=0.09],  [flightName=H1012, flightNum=10237, time=0.06],  [flightName=H1011, flightNum=10236, time=0.03]]
descending Iteratot
 [flightName=H1017, flightNum=10242, time=0.21]
 [flightName=H1016, flightNum=10241, time=0.18]
 [flightName=H1015, flightNum=10240, time=0.15]
 [flightName=H1014, flightNum=10239, time=0.12]
 [flightName=H1013, flightNum=10238, time=0.09]
 [flightName=H1012, flightNum=10237, time=0.06]
 [flightName=H1011, flightNum=10236, time=0.03]
Subset.............
 [flightName=H1011, flightNum=10236, time=0.03]
 [flightName=H1012, flightNum=10237, time=0.06]
 [flightName=H1013, flightNum=10238, time=0.09]
 [flightName=H1014, flightNum=10239, time=0.12]
HeadSet..................
 [flightName=H1011, flightNum=10236, time=0.03]
 [flightName=H1012, flightNum=10237, time=0.06]
 [flightName=H1013, flightNum=10238, time=0.09]
 [flightName=H1014, flightNum=10239, time=0.12]
Tailset...........
 [flightName=H1014, flightNum=10239, time=0.12]
 [flightName=H1015, flightNum=10240, time=0.15]
 [flightName=H1016, flightNum=10241, time=0.18]
 [flightName=H1017, flightNum=10242, time=0.21]
pollfirst : [flightName=H1011, flightNum=10236, time=0.03]
[ [flightName=H1012, flightNum=10237, time=0.06],  [flightName=H1013, flightNum=10238, time=0.09],  [flightName=H1014, flightNum=10239, time=0.12],  [flightName=H1015, flightNum=10240, time=0.15],  [flightName=H1016, flightNum=10241, time=0.18],  [flightName=H1017, flightNum=10242, time=0.21]]
polllast : [flightName=H1017, flightNum=10242, time=0.21]
[ [flightName=H1012, flightNum=10237, time=0.06],  [flightName=H1013, flightNum=10238, time=0.09],  [flightName=H1014, flightNum=10239, time=0.12],  [flightName=H1015, flightNum=10240, time=0.15],  [flightName=H1016, flightNum=10241, time=0.18]]
*/