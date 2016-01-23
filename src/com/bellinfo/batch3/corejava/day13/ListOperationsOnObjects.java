package com.bellinfo.batch3.corejava.day13;

import java.util.*;



public class ListOperationsOnObjects {

	public static void main(String[] args) {
       List<MobilePhone> phoneList = new ArrayList<>();
       
       MobilePhone mp1 = new MobilePhone();
       mp1.setName("Samsung");
       mp1.setOs("Android");
       mp1.setCost(500.00);
       
       MobilePhone mp2 = new MobilePhone();
       mp2.setName("Apple");
       mp2.setOs("iOS");
       mp2.setCost(600.00);
       

       
       MobilePhone mp3 = new MobilePhone();
       mp3.setName("LG");
       mp3.setOs("Android");
       mp3.setCost(400.00);
       
       MobilePhone mp4 = new MobilePhone();
       mp4.setName("Apple");
       mp4.setOs("iOS");
       mp4.setCost(600.00);
       
       phoneList.add(mp1);
       phoneList.add(mp2);
       phoneList.add(mp3);
       
       // retrieving data from arrayList
       System.out.println("**initial MobilePhone details**");
       for(MobilePhone m:phoneList){
    	   System.out.println(m);
       }
       
       HashSet<MobilePhone> phoneSet1 = new HashSet<>();
       phoneSet1.add(mp1);
       phoneSet1.add(mp2);
       phoneSet1.add(mp3);
       phoneSet1.add(mp4);
       
       //Retrieving data from HashSet
       System.out.println("***Using HashSet Eliminating duplicates***");
       for(MobilePhone m:phoneSet1){
    	   System.out.println(m);
       }
       
       // Sorting mobile phone objects
       //Collections.sort(phoneList);
       System.out.println("**use collection **");
       for(MobilePhone m:phoneList){
    	   System.out.println(m);
       }
       
       Set<MobilePhone> phoneSet = new TreeSet<>();
       phoneSet.addAll(phoneList);
       
       //Displaying tress set results
     /*  System.out.println("**After passing to TreeSet**");
       for(MobilePhone m:phoneSet){
    	   System.out.println(m);
       }*/
       
       
	}

}

class MobilePhone {
	
	private String name;
	private double cost;
	private String os;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		}
		if(obj instanceof MobilePhone){
			MobilePhone other = (MobilePhone)obj;
			if(name.equals(other.getName()) &&
			   cost ==other.getCost() &&
			   os.equals(other.getOs())){
				return true;
			}
		}
	  return false;	
	}
	
	public String toString(){
		return name + " "+cost + " "+os;
	}
	
	public int hashCode(){
		return 31*(name.hashCode()*os.hashCode());
	}

	/*public int compareTo(MobilePhone other) {
		int result = this.os.compareTo(other.getOs());
		if(result == 0){
			Double d1 = new Double(cost);
			Double d2 = new Double(other.getCost());
			return d1.compareTo(d2);
		}
		return result;
		
 	}*/
	
}