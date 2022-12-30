package chapter08_reference.staticmethod;

public class ReferenceStaticVariable {
	//static ���輺 Ȯ��
	static String name;
	public ReferenceStaticVariable() {}
	public ReferenceStaticVariable(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		ReferenceStaticVariable reference = new ReferenceStaticVariable();
		reference.checkName();
	}
	
	
	// �������� ȣ��Ȱ��� Ŭ���� ������ ������ ������ü�� ������ ������ ����
	// ������ ����ƽ�� �����ϸ� ������µǴ°� Ȯ���� �� ����
	public void checkName() {
		ReferenceStaticVariable reference2 = new ReferenceStaticVariable("�μ�2");
		System.out.println(reference2.name);
		ReferenceStaticVariable reference1 = new ReferenceStaticVariable("�μ�1");
		System.out.println(reference2.name);
	}

}
