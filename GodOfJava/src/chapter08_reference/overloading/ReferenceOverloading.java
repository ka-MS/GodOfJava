package chapter08_reference.overloading;

public class ReferenceOverloading {

	public static void main(String[] args) {
		// overloading�� �����ϴٶ�� �ǹ̷� �ϳ��� �޼ҵ� �̸��� ���� ����� ������ �� �ֵ��� �ϴ� ��
		// overloading�� �޼ҵ� �̸��� ���� �Ű��������� �ٸ��� �ϴ°��� �����ε��̶� �Ѵ�.
		// ���������ڳ� ����Ÿ�� static�� �ٸ����� �޼ҵ���� ���� �Ű������� �ٸ��ٸ� �����ε��� ����ȴ�.
		// ������ ����Ÿ�Ը�! �ٸ��ٸ� �����ε��� ������� �ʴ´�
		ReferenceOverloading ro = new ReferenceOverloading();
		System.out.println(ro.print(1, "dd"));
		System.out.println(ro.print("df", 3));
		System.out.println(print("�μ�", 1));

		// �־�? -> ��������ϴ� �޼ҵ带 �ϳ��� �̸����� ������ �� �ִ�.
		// -> �޼ҵ��̸��� ������ �� �ִ�.
	}

	public int print(int data) {
		return data;
	}

	// �̷��� ����Ÿ�Ը� �ٸ����� ������� �ʴ´�.
//	public String print(int data) {
//		return "";
//	}
	public String print(String data) {
		return data;
	}

	private String print(int intData, String StringData) {
		return intData + "��° : " + StringData;
	}

	private static String print(String StringData, int intData) {
		return StringData + " : " + intData + "��°";
	}

}
