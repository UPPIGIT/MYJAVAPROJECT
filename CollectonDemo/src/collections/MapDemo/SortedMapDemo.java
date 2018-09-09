package collections.MapDemo;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortedMapDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Double, String> treeMap= new TreeMap<>();
		
		treeMap.put(01.00, "H1");
		treeMap.put(01.30, "H19");
		treeMap.put(01.45, "H13");
		treeMap.put(02.00, "H78");
		treeMap.put(02.15, "H47");
		treeMap.put(02.30, "H58");
		treeMap.put(02.45, "H69");
		treeMap.put(03.00, "H14");
		treeMap.put(03.15, "H25");
		treeMap.put(03.45, "H36");
		treeMap.put(04.00, "H98");
		
		Set<Entry<Double, String>> setentry= treeMap.entrySet();
		
		Iterator<Entry<Double, String>> itr=setentry.iterator();
		
		while (itr.hasNext()) {
			Map.Entry<java.lang.Double, java.lang.String> entry = (Map.Entry<java.lang.Double, java.lang.String>) itr
					.next();
			
			System.out.println(entry.getKey()+"......................"+entry.getValue());
			
		}
		
		
		System.out.println("Sorted Map demo");
		
		System.out.println("=========HeadMap========");
		System.out.println("Head Set"+treeMap.headMap(02.20));
		System.out.println("Head Set"+treeMap.headMap(02.15));
		System.out.println("Head Set"+treeMap.headMap(02.15,true));
	//	System.out.println("Head Set"+treeMap.headMap(null)); NPE
		
		/*Sorted set demo
		Head Set{1.0=H1, 1.3=H19, 1.45=H13, 2.0=H78, 2.15=H47}
		Head Set{1.0=H1, 1.3=H19, 1.45=H13, 2.0=H78}
		Head Set{1.0=H1, 1.3=H19, 1.45=H13, 2.0=H78, 2.15=H47}
*/
		System.out.println("=========tailMap========");
		System.out.println("tail map: "+treeMap.tailMap(02.20));
		System.out.println("tail map: "+treeMap.tailMap(02.15));
		System.out.println("tail map: "+treeMap.tailMap(02.15,false));
		//System.out.println("tail map: "+treeMap.tailMap(null));NPE
		
		System.out.println("=========subMap========");
		System.out.println("submap :"+treeMap.subMap(01.02, 03.42));
		System.out.println("submap :"+treeMap.subMap(01.00, 03.00));
		System.out.println("submap :"+treeMap.subMap(01.00, true, 03.00,true));
	//	System.out.println("submap :"+treeMap.subMap(01.02, null)); NPE
		
		System.out.println("============Fist and Last Keys==============");
		
		System.out.println("First Key :"+treeMap.firstKey());
		System.out.println("Last Key :"+treeMap.lastKey());
		
		System.out.println("============Key Set and values==============");
		System.out.println("key Set"+treeMap.keySet());
		System.out.println("value set"+treeMap.values());
		
		System.out.println("......................Entry Set...........");
		
		System.out.println("Entry Set :"+treeMap.entrySet());
		
		System.out.println("\n");
		System.out.println(".....................................");
		System.out.println(".............Navigable Map  Demo..............");
		
		//System.out.println(treeMap.ceilingEntry(null)); NPE
		
		System.out.println("lower Entry :"+treeMap.lowerEntry(03.00));
		System.out.println("Lower Key :"+treeMap.lowerKey(03.00));
		
		System.out.println("floorEntry :"+treeMap.floorEntry(03.00));
		System.out.println("floorEntry :"+treeMap.floorEntry(02.06));
		System.out.println("floorEntry :"+treeMap.floorEntry(0.00));
		

		System.out.println("floorKey :"+treeMap.floorKey(03.00));
		System.out.println("floorKey :"+treeMap.floorKey(02.06));
		System.out.println("floorKey :"+treeMap.floorKey(0.00));
		
		System.out.println("Higher Entry :"+treeMap.higherEntry(02.55));
		System.out.println("Higher Key :"+treeMap.higherKey(02.55));
		
		System.out.println("Higher Entry :"+treeMap.higherEntry(03.00));
		System.out.println("Higher Key :"+treeMap.higherKey(03.00));
		
		
		System.out.println("ceilingEntry:"+treeMap.ceilingEntry(02.55));
		System.out.println("ceilingKey :"+treeMap.ceilingKey(02.55));
		
		System.out.println("ceilingEntry :"+treeMap.ceilingEntry(03.00));
		System.out.println("ceilingKey :"+treeMap.ceilingKey(03.00));
		
		System.out.println("descending Map :"+treeMap.descendingMap());
		System.out.println("Navigable Key Set :"+treeMap.navigableKeySet());
		System.out.println("descending keyset"+treeMap.descendingKeySet());
		
		
	}

	
}


/*1.0......................H1
1.3......................H19
1.45......................H13
2.0......................H78
2.15......................H47
2.3......................H58
2.45......................H69
3.0......................H14
3.15......................H25
3.45......................H36
4.0......................H98
Sorted Map demo
=========HeadMap========
Head Set{1.0=H1, 1.3=H19, 1.45=H13, 2.0=H78, 2.15=H47}
Head Set{1.0=H1, 1.3=H19, 1.45=H13, 2.0=H78}
Head Set{1.0=H1, 1.3=H19, 1.45=H13, 2.0=H78, 2.15=H47}
=========tailMap========
tail map: {2.3=H58, 2.45=H69, 3.0=H14, 3.15=H25, 3.45=H36, 4.0=H98}
tail map: {2.15=H47, 2.3=H58, 2.45=H69, 3.0=H14, 3.15=H25, 3.45=H36, 4.0=H98}
tail map: {2.3=H58, 2.45=H69, 3.0=H14, 3.15=H25, 3.45=H36, 4.0=H98}
=========subMap========
submap :{1.3=H19, 1.45=H13, 2.0=H78, 2.15=H47, 2.3=H58, 2.45=H69, 3.0=H14, 3.15=H25}
submap :{1.0=H1, 1.3=H19, 1.45=H13, 2.0=H78, 2.15=H47, 2.3=H58, 2.45=H69}
submap :{1.0=H1, 1.3=H19, 1.45=H13, 2.0=H78, 2.15=H47, 2.3=H58, 2.45=H69, 3.0=H14}
============Fist and Last Keys==============
First Key :1.0
Last Key :4.0
============Key Set and values==============
key Set[1.0, 1.3, 1.45, 2.0, 2.15, 2.3, 2.45, 3.0, 3.15, 3.45, 4.0]
value set[H1, H19, H13, H78, H47, H58, H69, H14, H25, H36, H98]
......................Entry Set...........
Entry Set :[1.0=H1, 1.3=H19, 1.45=H13, 2.0=H78, 2.15=H47, 2.3=H58, 2.45=H69, 3.0=H14, 3.15=H25, 3.45=H36, 4.0=H98]


.....................................
.............Navigable Map  Demo..............
lower Entry :2.45=H69
Lower Key :2.45
floorEntry :3.0=H14
floorEntry :2.0=H78
floorEntry :null
floorKey :3.0
floorKey :2.0
floorKey :null
Higher Entry :3.0=H14
Higher Key :3.0
Higher Entry :3.15=H25
Higher Key :3.15
ceilingEntry:3.0=H14
ceilingKey :3.0
ceilingEntry :3.0=H14
ceilingKey :3.0
descending Map :{4.0=H98, 3.45=H36, 3.15=H25, 3.0=H14, 2.45=H69, 2.3=H58, 2.15=H47, 2.0=H78, 1.45=H13, 1.3=H19, 1.0=H1}
Navigable Key Set :[1.0, 1.3, 1.45, 2.0, 2.15, 2.3, 2.45, 3.0, 3.15, 3.45, 4.0]
descending keyset[4.0, 3.45, 3.15, 3.0, 2.45, 2.3, 2.15, 2.0, 1.45, 1.3, 1.0]
*/