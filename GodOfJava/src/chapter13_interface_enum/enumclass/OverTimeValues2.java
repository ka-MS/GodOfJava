package chapter13_interface_enum.enumclass;

// enumŬ���� ����� switch ������� �ʰ� ����� Ȯ���Ϸ���?
public enum OverTimeValues2 {
	THREE_HOUR(18000), 
	FIVE_HOUR(30000),
	WEEKEND_FOUR_HOUR(40000),
	WEEKEND_EIGHT_HOUR(60000);
	private final int amount;
	
	// enumŬ������ �����ڴ� �ƹ��͵� ������� ���� package-private�� private�� ���������ڷ� ��� �����ϴ�
	// �� ����� enumŬ���� ������ ������ ������ �� �����ڸ� ����� �� �ִ�.
	OverTimeValues2(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
}
