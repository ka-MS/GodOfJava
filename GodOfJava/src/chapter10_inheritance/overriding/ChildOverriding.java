package chapter10_inheritance.overriding;

public class ChildOverriding extends ParentOverriding{
	public ChildOverriding() {
		System.out.println("childOverriding Constructor");
	}
	
	// �ڽ�Ŭ�������� ����� �θ�Ŭ������ �޼ҵ带 �Ȱ��� �����ͼ� �޼ҵ� ������ ������ �ش� �̰��� �������̵�
	// ����������, ����Ÿ��, �޼ҵ��, �Ű������� ��� ���ƾ� �������̵��� �ȴ�!
	// �����ϰ� �����Ѱ��� ������ �ñ״���(signature)�� �����ٰ� �Ѵ�
	// ����Ÿ���� �ٲ۴ٸ� �޼ҵ���� �����ϴ� �θ�Ŭ������ �����ϴ� �ؾ� �����۵��� �ȴ�
	@Override // ������̼��� ��� �������̵��� ������ '�����'���� ��Ÿ�� �ش� 
	public void printName() {
		System.out.println("ChildOverriding printName()");
	}
	
	// private, final, static�� �� ������ �θ�޼ҵ�� �������̵��̵��� �ʴ´�
	public void printNames(String name) {
		System.out.println("�ڽ�");
	}
	
	@Override
	public void printName2() {
		System.out.println("protected -> public���� ����ؼ� �������̵��� �����ϴ�");
	}
}
