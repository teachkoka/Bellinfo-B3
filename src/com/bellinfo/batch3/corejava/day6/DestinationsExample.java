package com.bellinfo.batch3.corejava.day6;

public class DestinationsExample {

	public static void main(String[] args) {
		Destinations d1 = new Destinations("goa","maharastra",1000.43);
		Destinations d2 = new Destinations("vizag","ap",1200);
		Destinations d3 = new Destinations("hyderabad","T",1000);
		
		Destinations d4 = new Destinations();
		d4.setName("bejing");
		d4.setLocation("china");
		d4.setSqft(1212121.32);
		
		Destinations[] holidaySpots = new Destinations[4];
		holidaySpots[0] = d1;
		holidaySpots[1] = d2;
		holidaySpots[2] = d3;
		holidaySpots[3] = d4;
		
		for(int i =0; i<= holidaySpots.length-1;i++){
			Destinations dd =holidaySpots[i];
			System.out.println(dd.getNameLocation());
			System.out.println(dd.getName());
			System.out.println(dd.getSqft());
		}
		
		
	}
}
class Destinations {
	
	private String name;
	private String location;
	private double sqft;
	private String[] hotels;
	Destinations(){
		
	}
	Destinations(String name1, String location1, double sqft1){
	   name = name1;
	   location = location1;
	   sqft =sqft1;
	}
	public void setName(String n){
		name =n ;
	}
	public String getName(){
		return name;
	}
	public void setLocation(String l){
		name =l ;
	}
	public String getNameLocation(){
		return name;
	}
	public void setSqft(double s){
		sqft =s ;
	}
	public double getSqft(){
		return sqft;
	}
	
}
