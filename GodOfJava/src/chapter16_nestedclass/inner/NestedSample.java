package chapter16_nestedclass.inner;

public class NestedSample {

	public static void main(String[] args) {
		NestedSample sample = new NestedSample();
		sample.makeStaticNEstedObject();
	}

	public void makeStaticNEstedObject() {
		// static Nested Ŭ������ ��ü�� ����Ŭ����.����Ŭ������ �����Ͽ� �����ϸ� �ȴ�
		// �� ����? -> Ŭ������ ���� ����!
		OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
		staticNested.setValue(3);
		System.out.println(staticNested.getValue());
	}

	
	// �Ʒ��� ��� ó�� ���б��� �л����� ���б��� �л����� �Һи��� �� �ִ�. �� �л��� ���������� �ٸ� ������ �ؾ��� �� �̴�
	// static NestedŬ������ ������ ���б�.�л� ���б�.�л� ó�� ���� ������ �� �������̴�
	static class University {
		static class Student {

		}
	}

	static class MiddleSchool {
		static class Student {

		}
	}
}
