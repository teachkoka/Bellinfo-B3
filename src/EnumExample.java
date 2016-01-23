
enum Week{
	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4),THURSDAY(5), FRIDAY(6), SATURDAY(6);
	int day;
	Week(int day){
		this.day= day;
	}
	Week(){
		this.day=1;
	}
	
	public int getDay(){
		return day;
	}
	
	public void method1(){
		System.out.println("inside enum");
	}
}

public class EnumExample {

	public static void main(String[] args) {
		Week[] week = Week.values();
		
		System.out.println(week[0]);
		System.out.println(Week.valueOf("FRIDAY"));
		System.out.println(week[1].getDay());
	}

}
