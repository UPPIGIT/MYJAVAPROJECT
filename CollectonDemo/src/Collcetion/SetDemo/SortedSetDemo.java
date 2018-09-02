package Collcetion.SetDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Cars> cars=new TreeSet<>();
		
		for (int i = 1; i <= 11; i++) {
			
			Cars c=new Cars("H"+i, (float) (17*3.78*i+i*3));
			
			cars.add(c);
		}
		
		
		Iterator<Cars> carsiterator=cars.iterator();
		while (carsiterator.hasNext()) {
			Cars cars2 = (Cars) carsiterator.next();
			
			System.out.println(cars2);
			
		}
		
		System.out.println("==========================");
		System.out.println("less price car :"+cars.first());
		System.out.println("High price Car  :"+cars.last());
		
		System.out.println("headset.......");
		Set<Cars> s1=cars.headSet(new Cars("K",400.00f),true);
		
		Iterator<Cars> setitr= s1.iterator();
		
		while (setitr.hasNext()) {
			Cars cars2 = (Cars) setitr.next();
			System.out.println(cars2);
			
		}
		
		System.out.println("Tailset......");
		
		Set<Cars> tailset= cars.tailSet(new Cars("H",400.00f));
		
		Iterator<Cars> tailitr=tailset.iterator();
		while (tailitr.hasNext()) {
			Cars cars2 = (Cars) tailitr.next();
			
			System.out.println(cars2);
			
		
			
		}
		
		System.out.println(cars.comparator());
		
		System.out.println("subset.....................");
		
		Set<Cars> subSet=cars.subSet(new Cars("H",200.00f), new Cars("H",400.00f));
		
		Iterator<Cars> subsetitr=subSet.iterator();
		while (subsetitr.hasNext()) {
			Cars cars2 = (Cars) subsetitr.next();
			
			System.out.println(cars2);
			
		}
	}

}

/*Cars [carType=H1, price=67.26]
Cars [carType=H2, price=134.52]
Cars [carType=H3, price=201.78]
Cars [carType=H4, price=269.04]
Cars [carType=H5, price=336.3]
Cars [carType=H6, price=403.56]
Cars [carType=H7, price=470.82]
Cars [carType=H8, price=538.08]
Cars [carType=H9, price=605.34]
Cars [carType=H10, price=672.6]
Cars [carType=H11, price=739.86]
==========================
less price car :Cars [carType=H1, price=67.26]
High price Car  :Cars [carType=H11, price=739.86]
headset.......
Cars [carType=H1, price=67.26]
Cars [carType=H2, price=134.52]
Cars [carType=H3, price=201.78]
Cars [carType=H4, price=269.04]
Cars [carType=H5, price=336.3]
Tailset......
Cars [carType=H6, price=403.56]
Cars [carType=H7, price=470.82]
Cars [carType=H8, price=538.08]
Cars [carType=H9, price=605.34]
Cars [carType=H10, price=672.6]
Cars [carType=H11, price=739.86]
null
subset.....................
Cars [carType=H3, price=201.78]
Cars [carType=H4, price=269.04]
Cars [carType=H5, price=336.3]
*/
