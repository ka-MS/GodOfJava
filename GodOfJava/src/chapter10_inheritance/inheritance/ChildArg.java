package chapter10_inheritance.inheritance;

public class ChildArg extends ParentArg{
	
	// ��ӹ޴� �θ�Ŭ������ �⺻�����ڰ� ���� ������ ������ �߻��Ѵ�. 
	// ���⼭ super���� ���δ� ->super������ �θ�Ŭ������ �����ڸ� ȣ���Ѵٴ°��� �ǹ��Ѵ�.
	// ���� �θ�Ŭ������ �⺻�����ڸ� �������־ ������ok
	
	public ChildArg() {
		super("�μ�");
//		super(null); //The constructor ParentArg(String) is ambiguous 
		// -> �θ�Ŭ������ �Ű����� �����ڰ� 2���̻��̶� ��ȣ�ϴٴ� ���������� ��� �־������ �𸥴ٴ°�
		
		System.out.println("child constructor");
	}
	//
//	public ChildArg(String name) {
//		super(name);
//	}

}
