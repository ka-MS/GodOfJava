package chapter10_inheritance.inheritance;

public class ParentArg {
	
	
	// �Ű����������ڸ� ����� �⺻�����ڸ� �������� �ʴ´ٸ�? ��ӽ� �⺻�����ڰ� ���ٴ� ������ ������ �߻��Ѵ�.
	public ParentArg(String name) {
		System.out.println("parentArg("+name + ")  Constructor");
	}
	public ParentArg(Integer Age) {
		System.out.println("ParentArg("+Age+") Constructor");
	}
	public void printName() {
		System.out.println("printName() - ParentArg");
	}
}
