package chapter10_inheritance.overriding;

public class ParentOverriding {
	
	//�������̵��̶�? �ڽ�Ŭ�������� �θ�Ŭ������ �ִ� �޼ҵ�� �����ϰ� �����ϴ°��� �������̵��̶��Ѵ�!
	
	public ParentOverriding() {
		System.out.println("ParenrOverriding Constructor");
	}
	
	// �θ�Ŭ������ �޼ҵ� ����!
	public void printName() {
		System.out.println("printName() - ParentOverriding");
	}
	
	// private�� �������ָ� overriding�� �� ����
	private void printNames(String name) {
		System.out.println(name);
	}
	
	protected void printName2() {
		System.out.println("printName2() - ParenrOverriding");
	}
}
