package chapter13_interface_enum.util;

public class FinalVariable {
	// final ���� Ŭ������ �޼ҵ忡 ����ϸ� override�� �� ���� �ϴ°�
	// ������ final�� ����ϸ�? ���̻� �ٲ� �� ���ٶ�� �� -> ����� �Բ� ���� �����ؾ� �Ѵ�
	final int instanceVariable = 1; // �ν��Ͻ����� ������ ���ÿ� �ʱ�ȭ�� �� �־�� ������ �߻����� �ʴ´�
	public void method(final int parameter) {
		// �Ű��������̳� ���������� final�� ����Ѵ� �ؼ� �ʱ�ȭ�� �ٷ� ����������� �ʴ�
		final int localVariable;
		localVariable = 1;
		
		// ������ �޼ҵ� ������ �� �����ϴ°��� ������ ������ �߻��Ѵ�
		// �Ķ���Ͱ��� �Ѿ�������� ���� �����Ǿ �Ѿ���� ���������� ���� �Ҵ��ϴ¼��� ������ ���� �ʱ⋚���̴�
//		localVariable = 2;
//		parameter = 0;
	}
}
