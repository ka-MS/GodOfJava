package chapter16_nestedclass.inner;

public class InnerSample {

	public static void main(String[] args) {
		InnerSample sample = new InnerSample();
		sample.markInnerObject();

	}
	// innerŬ������ ����ϱ� ���ؼ��� ���� Ŭ���� ��ü�� ���� �����ؾ��Ѵ�.
	public void markInnerObject() {
		OuterOfInner outer = new OuterOfInner(); // ���� Ŭ���� ��ü ����
		OuterOfInner.Inner inner = outer.new Inner(); // �ش� ��ü�� ���� innerŬ������ ���� �� �ִ�.
		inner.setValue(3);
		System.out.println(inner.getValue());
	}
}
