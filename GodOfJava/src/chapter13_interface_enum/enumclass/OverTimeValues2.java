package chapter13_interface_enum.enumclass;

// enum클래스 선언시 switch 사용하지 않고 상수값 확인하려면?
public enum OverTimeValues2 {
	THREE_HOUR(18000), 
	FIVE_HOUR(30000),
	WEEKEND_FOUR_HOUR(40000),
	WEEKEND_EIGHT_HOUR(60000);
	private final int amount;
	
	// enum클래스의 생성자는 아무것도 명시하지 않은 package-private나 private만 접근제어자로 사용 가능하다
	// 각 상수를 enum클래스 내에서 선언할 때에만 이 생성자를 사용할 수 있다.
	OverTimeValues2(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
}
