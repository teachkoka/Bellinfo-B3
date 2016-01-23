package com.bellinfo.batch3.corejava.practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentComparable {

	@SuppressWarnings("unchecked") public static void main(String[] args) {
		Technology t = new Technology();
		t.setTechId(2);
		t.setTecName("Siva");
		
		Technology t1 = new Technology();
		t1.setTechId(2);
		t1.setTecName("BSA");
		
		Technology t2 = new Technology();
		t2.setTechId(1);
		t2.setTecName("Apple");
		
		Set<Technology> techSet = new TreeSet<>();
		techSet.add(t);
		techSet.add(t1);
		techSet.add(t2);
		
		for(Technology tec:techSet){
//	/		System.out.println(tec.toString());
		}
		
		List<Technology> list = new ArrayList<Technology>();
		list.add(t);
		list.add(t1);
		list.add(t2);
		Collections.sort(list,new TechComparator());
		
		for(Technology tec:list){
			System.out.println(tec.toString());
		}
  }	
}

class Technology implements Comparable{
	
	int techId;
	String tecName;
	public int getTechId() {
		return techId;
	}
	public void setTechId(int techId) {
		this.techId = techId;
	}
	public String getTecName() {
		return tecName;
	}
	public void setTecName(String tecName) {
		this.tecName = tecName;
	}
	
	public String toString(){
		return "TechId " +techId+" TecName "+tecName;
	}

	public boolean toString(Object obj){
		if(obj == null){
			return false;
		}
		if(obj instanceof Technology){
			Technology other = (Technology)obj;
			if(techId==other.getTechId() && tecName.equals(other.tecName)){
				return true;
			}
			
		}
		return false;
	}
	/**
	 * Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
	 */
	@Override public int compareTo(Object o) {
		Technology t = (Technology)o;
		int x = this.techId-t.techId;
		/*if(x==0){
			x = this.tecName.compareTo(t.tecName);
		}*/
		return x;
	}
}

class TechComparator implements Comparator {

	@Override public int compare(Object o1, Object o2) {
		Technology t1 = (Technology) o1;
		Technology t2 = (Technology) o1;
		int x = t1.techId-t2.techId;
		int result;
		if(x ==0){
			x = t1.getTecName().compareTo(t2.getTecName());
		}
		return x;
	}
}





