package chapter08_reference.staticmethod;

public class ReferenceStatic {
	String name = "�μ�";
	static String staticName = "����ƽ�μ�";
	// static �� ��ü�� �������� �ʾƵ� �޼ҵ带 ȣ���� �� �ִ�!
	// ������ Ŭ���� ������ ȣ�Ⱑ�� ->Ŭ���� ������ �ν��Ͻ������� static�� ���ΰ�
	public static void main(String[] args) {
		ReferenceStatic.staticMethod(); // ��ü �������� ���
//		System.out.println(name); // �����߻�
		System.out.println(staticName);
	}
	public static void staticMethod() {
		System.out.println("This is a staticMethod.");
	}

}
