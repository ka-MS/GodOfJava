package chapter10_inheritance.inheritance;

public class InheritancePrint {

	public static void main(String[] args) {
//		Child child = new Child();
//		child.printName();
//		ChildPrint childPrint = new ChildPrint();
//		childPrint.printAge();
		ChildArg childArg = new ChildArg();
		childArg.printName();
		// �θ������ ���� -> �ڽĻ����� ���� -> �θ�Ŭ������ printName() �޼ҵ����
		// ���� ����� ���� �ʾҴٸ� �̸��� ����ؾ��Ҷ����� printName�� ������ ������ �׸��� �������� ������ Ŭ�������� �ؾ�������
		// �ڹٿ����� ���߻���� �Ұ��ϸ� extends ���� ����ؾ���
	}

}
