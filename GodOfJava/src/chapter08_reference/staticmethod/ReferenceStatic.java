package chapter08_reference.staticmethod;

public class ReferenceStatic {
	String name = "민석";
	static String staticName = "스태틱민석";
	// static 은 객체를 생성하지 않아도 메소드를 호출할 수 있다!
	// 하지만 클래스 변수만 호출가능 ->클래스 변수란 인스턴스변수에 static을 붙인것
	// static은 메모리 영역에 자원을 할당해 놓고 사용하는것, 모든 객체가 메모리를 공유함
	// static 왜써? -> 전역적으로 쉽게 재사용되는 변수나 메소드등을 사용할 때 주로 사용된다
	// 많이 사용하게되면 메모리를 많이 차지하게 되어 무거워짐
	public static void main(String[] args) {
		ReferenceStatic.staticMethod(); // 객체 생성없이 사용
//		System.out.println(name); // 오류발생
		System.out.println(staticName);
	}
	public static void staticMethod() {
		System.out.println("This is a staticMethod.");
	}

}
