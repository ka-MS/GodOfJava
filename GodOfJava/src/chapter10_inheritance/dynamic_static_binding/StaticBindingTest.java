package chapter10_inheritance.dynamic_static_binding;

public class StaticBindingTest {
	/* 
	 * ���ε��̶� ���α׷��� ���� ��������� ������ �Ǵ� ������Ƽ�� �������� ������ �ǹ���
	 * -> ������Ƽ��?? 
	 * �������ε��̶� compile-time�� �߻��ϰ� runtime���ȿ��� ������ �ʴ� ���·� �����Ǵ� ���ε��̴�
	 * static private final �޼ҵ�� ���� ���ε� ����̴�
	 * static �޼ҵ�� �������̵� �� �� ���� why?
	 * static �޼ҵ�� �����Ͻ�, �޸𸮿� �ö󰡰� �޼ҵ� ������ �����Ѵ�
	 * ��, ��ü ������ ������ ���� �ش� Ŭ�����κ����� ��� �ν��Ͻ��� �����Ѵ� 
	 * -> �����Ͻ� �����Ǿ��ִ� �����̹Ƿ� ��Ÿ�ӿ� ��ȭ�ؾ��ϴ� �������̵��� �翬�� �ȵǴ°� -> ���̵��̶� ������� ������ �ϳ� �����ʴ´�.
	 */
	public void method(Parent p) {
		System.out.println("method(Parent)...");
	}
	
	public void method(Child c) {
		System.out.println("method(Child)...");
	}

	public static void main(String[] args) {
		
		Parent parent = new Child();
		Child child = new Child();
		
		StaticBindingTest test = new StaticBindingTest();
		
		// ��ó�� �����ε��� �޼ҵ�� Ÿ�� �������� ������ ���ε��� 
		test.method(parent);
		test.method(child);
		
		parent.method(); // child Ŭ�������� �����ε���
	}

}


