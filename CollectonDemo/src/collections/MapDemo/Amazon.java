package collections.MapDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Amazon {

	static Mobiles mb= new Mobiles();
	static Cars cars= new Cars();
	
	TreeMap<String, Double> treemap= new TreeMap<>();
	
	Set<Entry<String, Double>> setentry;
	
	public void addToCart(String type)
	{
		Iterator<Cars> car=	cars.carsList.iterator();
	    Iterator<Mobiles> mobies=	mb.mobileList.iterator();
	    Double price;
	    
		while (car.hasNext()) {
			Cars cars = (Cars) car.next();
			
			if (cars.carType.equals(type)) {
				
				 price=cars.carPrice;
				
				treemap.put(type, price);
				
			}
			
		
		}
		
		while (mobies.hasNext()) {
			Mobiles mobiles = (Mobiles) mobies.next();
			
			if (mobiles.mobileType.equals(type)) {
				
				price=mobiles.price;
				
				treemap.put(type, price);
				
			}
			
		}
		
		System.out.println("added to cart :"+type);
	}
	
	public void showCart()
	{
	
	System.out.println("=========show cart :================");	
    setentry=	treemap.entrySet();
	
	Iterator<Entry<String, Double>> itr=setentry.iterator();
	
	while (itr.hasNext()) {
		Map.Entry<java.lang.String, java.lang.Double> entry = (Map.Entry<java.lang.String, java.lang.Double>) itr
				.next();
		
		System.out.println(entry.getKey()+"......................."+entry.getValue());
		
	}
	}
	
	public  Double totalBill()
	{
		Double totalBill=0.0;
		Iterator<Entry<String, Double>> itr= setentry.iterator();
		
		while (itr.hasNext()) {
			Map.Entry<java.lang.String, java.lang.Double> entry = (Map.Entry<java.lang.String, java.lang.Double>) itr
					.next();
		totalBill+=entry.getValue();	
			
		}
		
		return totalBill;
	}
	
	public static void main(String[] args) {
		
	
		
		mb.showAllMobileTypes();
		cars.showAllCars();
		
		Amazon amz= new Amazon();
		
		amz.addToCart("MB1");
		amz.addToCart("CAR3");
		amz.addToCart("MB2");
		amz.addToCart("CAR2");
		amz.addToCart("MB4");
		amz.addToCart("CAR4");
		 
		amz.showCart();
		
		System.out.println("Toal bill :"+amz.totalBill());

	}

}
