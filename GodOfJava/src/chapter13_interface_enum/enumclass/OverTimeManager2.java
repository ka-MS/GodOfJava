package chapter13_interface_enum.enumclass;

public class OverTimeManager2 {

	public static void main(String[] args) {
		OverTimeValues2 ot = OverTimeValues2.FIVE_HOUR; // �̷��� ��ü �����Ͽ� ��밡��
		System.out.println(OverTimeValues2.FIVE_HOUR.getAmount()); // �� ����� �������� �޼ҵ� ���
		System.out.println(ot);
		System.out.println(ot.getAmount());
		
		OverTimeValues2[] ot2 = OverTimeValues2.values(); //values�޼ҵ带 ����ϸ� �迭���·� enum�� �� �� �ִ�
		System.out.println(ot.compareTo(ot2[0])); // ������ üũ�ϴ� �޼ҵ�
		System.out.println(ot2[0]); 

	}

}
