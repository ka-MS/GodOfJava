package abstractclass;

public class MathTeacher extends Teacher implements ClassTeach, FreshmanDepartment {

	// ���������μ��� ���� ����
	@Override
	public void teach() {
		System.out.println("���м�����");
	}

	// �������μ��� ����
	@Override
	public void classTeach() {
		System.out.println("2�� ���Ӽ�����");
	}

	@Override
	public void attendance() {
		System.out.println("�⼮�θ� �θ���.");
	}

	// 1�г� �μ��� ����
	@Override
	public void controllClass() {
		System.out.println("1�ݺ��� 4��");

	}

	@Override
	public void freshmanActivity() {
		System.out.println("1�г� ��� ������");
	}

	@Override
	public void studentConsulting() {
		System.out.println("1�г� ���");
	}

}
