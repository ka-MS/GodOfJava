package chapter16_nestedclass.inner;

public class InnerSample {

	public static void main(String[] args) {
		InnerSample sample = new InnerSample();
		sample.markInnerObject();

	}
	// inner클래스를 사용하기 위해서는 감싼 클래스 객체를 먼저 선언해야한다.
	public void markInnerObject() {
		OuterOfInner outer = new OuterOfInner(); // 감싼 클래스 객체 선언
		OuterOfInner.Inner inner = outer.new Inner(); // 해당 객체를 통해 inner클래스를 만들 수 있다.
		inner.setValue(3);
		System.out.println(inner.getValue());
	}
}
