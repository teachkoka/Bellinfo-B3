package com.bellinfo.batch3.corejava.day11;


enum Week{
	SUNDAY(1,"Funday"), MONDAY(2,"Lazy1"), 
	TUESDAY(3,"lazy2"), WEDNESDAY(4,"work"), 
	THURSDAY(5,"work"), FRIDAY(6,"pub"), SATURDAY(7,"drinks");
	int day;
	String describe;
	Week(int day){
		this.day = day;
	}
	Week(int day, String desc){
		this.day= day;
		describe=desc;
	}
	public int getDay(){
		return day;
	}
	
}
public class EnumEx {

	public static void main(String[] args) {

		Week[] weekDays = Week.values();
		for(int i=0;i<weekDays.length;i++){
			System.out.println(weekDays[i] + " "+weekDays[i].getDay());
		}
		
	}

}











