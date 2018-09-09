package collections.MapDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars {
	
	 String carType;
	 Double carPrice;
	
	ArrayList<Cars> carsList= new ArrayList<>();
	
	public Cars(String carType,Double carPrice)
	{
		this.carType=carType;
		this.carPrice=carPrice;
		
		
	}
	
	public Cars()
	{
		for (int i = 0; i < 5; i++) {
			
			carType="CAR"+i;
			carPrice=Math.random()*100000.000+100;
			
			Cars cars=new Cars(carType, carPrice);
			
			carsList.add(cars);
			
			
		}
		
	}
	
	public void showAllCars()
	{
		
		System.out.println("==========Show all Cars==============");
		
		Iterator<Cars> cars= carsList.iterator();
		while (cars.hasNext()) {
			Cars cars2 = (Cars) cars.next();
			
			System.out.println(cars2);
			
		}
		
	}

	@Override
	public String toString() {
		return "Cars [carType=" + carType + ", carPrice=" + carPrice + "]";
	}

	public static void main(String[] args) {
		
		Cars cars= new Cars();
		
		cars.showAllCars();

	}

}
