package chapter08_reference.staticmethod;

public class ReferenceStatic {
	String name = "민석";
	static String staticName = "스태틱민석";
	// static 은 객체를 생성하지 않아도 메소드를 호출할 수 있다!
	// 하지만 클래스 변수만 호출가능 ->클래스 변수란 인스턴스변수에 static을 붙인것
	public static void main(String[] args) {
		ReferenceStatic.staticMethod(); // 객체 생성없이 사용
//		System.out.println(name); // 오류발생
		System.out.println(staticName);
	}
	public static void staticMethod() {
		System.out.println("This is a staticMethod.");
	}

}
