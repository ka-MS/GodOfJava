package chapter13_interface_enum.enumclass;

public class OverTimeManager {
	public static void main(String[] args) {
		OverTimeManager ot = new OverTimeManager();
		// enum클래스이름.상수이름 을 지정하여 객체생성을 한다
		int myAmount = ot.getOverTimeAmount(OverTimeValues.THREE_HOUR);
		System.out.println(myAmount);
	}
	public int getOverTimeAmount(OverTimeValues value) {
		int amount = 0;
		System.out.println(value);
		switch(value) {
		case THREE_HOUR : amount = 18000; break;
		case FIVE_HOUR : amount = 30000; break;
		case WEEKEND_FOUR_HOUR: amount = 40000; break;
		case WEEKEND_EIGHT_HOUR: amount = 60000; break;
		}
		return amount;
	}
}
