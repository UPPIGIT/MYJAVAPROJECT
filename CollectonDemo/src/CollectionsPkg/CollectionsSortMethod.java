package CollectionsPkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("apple");
		al.add("cat");
		al.add("bat");
		al.add("donkey");
		al.add("orange");
		al.add("123");
		al.add("abc123");
	//	al.add(null);NPE
		
		System.out.println("before sorting"+al);//Insertion Order
		
		Collections.sort(al);
		
		System.out.println("After sort"+al);//default natural sorting order
		
		Collections.reverse(al);
		
		System.out.println("Reverse order"+al);
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		
		System.out.println(Collections.binarySearch(al, "123"));
		System.out.println(Collections.binarySearch(al, "zzz"));
		System.out.println(Collections.binarySearch(al, "ABC"));
		System.out.println(Collections.binarySearch(al, "nnn"));
		
		
		List<EMP> emplist= new ArrayList<>();
		
		EMP e1= new EMP("abc", 1);
		EMP e2= new EMP("aaa", 2);
		EMP e3= new EMP("bbb", 3);
		EMP e4= new EMP("ccc", 4);
		EMP e5= new EMP("ddd", 5);
		
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		
		System.out.println("EMP objects before sorting"+emplist);
		
		Collections.sort(emplist, new MyComparator());
		
		System.out.println("EMP objects after sorting"+emplist);
		
		System.out.println(Collections.binarySearch(emplist, new EMP("ccc", 4), new MyComparator()));
		System.out.println(Collections.binarySearch(emplist, new EMP("kkk", 9), new MyComparator()));
		System.out.println(Collections.binarySearch(emplist, new EMP("kkk", 6), new MyComparator()));
		//System.out.println(Collections.binarySearch(emplist, new EMP("kkk", null), new MyComparator()));//NPE
	/*	
		Collections.sort(emplist, Collections.reverseOrder());
		System.out.println(emplist); CCE*/
		
		Comparator<EMP> newComp=Collections.reverseOrder(new MyComparator());
		
		Collections.sort(emplist,newComp);
		
		System.out.println(emplist);
		
		
	


		

	}

}


/*User defined objects sorting*/

class EMP
{
	
	String ename;
	Integer eid;
	
	
public EMP(String ename,Integer eid) {
	
	this.ename=ename;
	this.eid=eid;
	
}


@Override
public String toString() {
	return "EMP [ename=" + ename + ", eid=" + eid + "]";
}
}

class MyComparator implements Comparator<EMP>
{

	@Override
	public int compare(EMP o1, EMP o2) {
	
		Integer empno1=o1.eid;
		Integer empno2=o2.eid;
		return empno2.compareTo(empno1);
	}
	

}
