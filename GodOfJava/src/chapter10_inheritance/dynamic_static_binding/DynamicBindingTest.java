package chapter10_inheritance.dynamic_static_binding;

public class DynamicBindingTest {
	// �������ε��� �������� ����Ͽ� �޼ҵ带 ȣ���� �� �߻��Ѵ� 
	// ��Ÿ�ӽ� , �� ��������� ������ �����ȴ�
	// ChildŬ������ method2�� �������̵��ߴ�.  ���� Ÿ���� Parent ������ �����δ� child��ü�̹Ƿ� child�� �������̵��� �޼ҵ带 ȣ���Ѵ�.
	// �����Ϸ��� ���� ��ü�� �������� �����Ͻð����ȿ��� �Ǵ��� �� �����Ƿ� ����������� ���ε��� �̷�� �ȴ�
	// stack�̳� queue  ������ ����
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.method2();

	}

}