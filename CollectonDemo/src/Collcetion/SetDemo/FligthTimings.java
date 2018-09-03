package Collcetion.SetDemo;

import java.util.Comparator;

public class FligthTimings implements Comparator<FligthTimings> {

	String flightName;
	Integer flightNum;
	Float time;
	
	public FligthTimings() {
		// TODO Auto-generated constructor stub
	}
	
	public FligthTimings(String flightName, Integer flightNum, Float time) {
		
		this.flightName = flightName;
		this.flightNum = flightNum;
		this.time = time;
	}

	@Override
	public String toString() {
		return " [flightName=" + flightName + ", flightNum=" + flightNum + ", time=" + time + "]";
	}

	@Override
	public int compare(FligthTimings o1, FligthTimings o2) {
		// TODO Auto-generated method stub
		//System.out.println("Flights compare() method");
		return o1.time.compareTo(o2.time);
	}

}
