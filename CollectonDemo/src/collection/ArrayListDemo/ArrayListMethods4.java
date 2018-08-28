package collection.ArrayListDemo;
import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods4 {

		public static void main(String[] args) {
			
			ArrayList al = new ArrayList<>();
			
			al.add(10);
			al.add(100);
			al.add(20);
			al.add(200);
			al.add(30);
			al.add(400);
			al.add(50);
			al.add(500);
			
			System.out.println(al);//[10, 100, 20, 200, 30, 400, 50, 500]
			
			ArrayList al1 = new ArrayList<>();
			al1.add(100);
			al1.add(200);
			al1.add(400);
			al1.add(500);
			
			al.removeAll(al1);
			
			System.out.println(al);//[10, 20, 30, 50]
			
			al.clear();
			System.out.println(al);
			
			
			ArrayList list = new ArrayList<>();
			
			list.add(222);
			list.add(333);
			list.add(444);
			list.add(555);
			list.add(666);
			
			List sublist = list.subList(2, 5);
			System.out.println(list);
			System.out.println(sublist);
			
			//list.add(2, 2222);
			//list.add(2222);
			list.set(0, 999);
			list.set(3,888);
			System.out.println(list);
			System.out.println(sublist);
			
			sublist.set(1, 213);
			System.out.println(list);
			System.out.println(sublist);
			
			

		}
		
}

/*[10, 100, 20, 200, 30, 400, 50, 500]
[10, 20, 30, 50]
[]
[222, 333, 444, 555, 666]
[444, 555, 666]
[999, 333, 444, 888, 666]
[444, 888, 666]
[999, 333, 444, 213, 666]
[444, 213, 666]*/
