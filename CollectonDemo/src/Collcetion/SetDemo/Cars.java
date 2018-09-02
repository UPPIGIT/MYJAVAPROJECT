package Collcetion.SetDemo;

@SuppressWarnings("rawtypes")
public class Cars implements Comparable {
	
	String carType;
	Float price;
	
	
	public Cars(String carType, Float price) {
		
		this.carType = carType;
		this.price = price;
	}

	@Override
	public int compareTo(Object o) {
		Cars cars=(Cars)o;
		
		Float price1=cars.price;
		Float price2=price;
		
		if (price1>price2) {
			return -1;
			
		}else if (price1<price2) {
			return +1;
		}
		else {
			return 0;
		}
	
	}
	@Override
	public String toString() {
		return "Cars [carType=" + carType + ", price=" + price + "]";
	}
	
	
	

}
