package collections.MapDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Mobiles {
	
	String mobileType;
	Double price;
    ArrayList<Mobiles> mobileList=new ArrayList<>();;
	
	public Mobiles(String mobileType ,Double price)
	{
		
		this.mobileType=mobileType;
		this.price=price;
		
	}
	
	public Mobiles() {
		
		for (int i = 1; i <= 5; i++) {
			
			mobileType="MB"+i;
			price=Math.random()*10000.00*10+1;
			
			Mobiles mobiles=new Mobiles(mobileType, price);
			
		    
			mobileList.add(mobiles);
			
		}
		
	}
	
	public void  showAllMobileTypes()
	{
		System.out.println("==================All Mobiles========================");
		Iterator<Mobiles> itr= mobileList.iterator();
		
		while (itr.hasNext()) {
			Mobiles mobiles = (Mobiles) itr.next();
			
			System.out.println(mobiles);
			
		}
		
	}
	
	@Override
	public String toString() {
		return "Mobiles [mobileType=" + mobileType + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		
		Mobiles mb= new Mobiles();
		
		mb.showAllMobileTypes();
	
		}
}
