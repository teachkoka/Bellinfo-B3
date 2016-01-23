package com.bellinfo.batch3.corejava.day7;

public class StudentExample1 {
	
	public static void main(String[] args) {
	    int x =10;
	    int y =10;
	    
		if(x==y){
			System.out.println("x an y are same");
		} else {
			System.out.println("x and y are different");
		}
		
		StudentData sd1 = new StudentData();
		StudentData sd2 = new StudentData();
		StudentData sd3 = new StudentData();
		
		sd1.setId(1);
		sd1.setName("Siva");
		sd1.setFee(12.43);
		
		sd2.setId(1);
		sd2.setName("Siva");
		sd2.setFee(12.43);
		
		sd3.setId(3);
		sd3.setName("Rajesh");
		sd3.setFee(43.32);
		
		if(sd1 == sd2){
			System.out.println("sd1 and sd2 are same");
		} else {
			System.out.println("sd1 and sd2 are not same");
		}
		if(sd2 == sd3){
			System.out.println("sd2 and sd3 are same");
		} else{
			System.out.println("sd2 and sd3 not are same");
		}
		
		
		if(sd1.equals(sd2)){
			System.out.println("sd1 and sd2 are same with equals method comparision");
		} else {
			System.out.println("sd1 and sd2 are not same with equals method comparision");
		}
		
		
		System.out.println(sd1);
		System.out.println(sd2.toString());
		System.out.println(sd3.toString());

	}
}

class StudentData {
	private int id;
	private String name;
	private double fee;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public boolean equals(Object obj){
		if(obj ==null){
			return false;
		}
		if(obj instanceof StudentData){
			StudentData otherStud =(StudentData)obj;
			int otherId = otherStud.getId();
			String otherName = otherStud.getName();
			double otherFee = otherStud.getFee();
			
			if(this.id==otherId && this.name.equals(otherName) && this.fee == otherFee){
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode(){
		
		return 31*name.hashCode()*id;
		
	}
	
	
	public String toString(){
		return getClass().getName()+ " "+" id "+getId() + " name "+getName()+
				" fee "+getFee();
		
	}
	
}