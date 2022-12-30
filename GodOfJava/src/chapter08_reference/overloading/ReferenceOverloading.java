package chapter08_reference.overloading;

public class ReferenceOverloading {

	public static void main(String[] args) {
		// overloading은 과적하다라는 의미로 하나의 메소드 이름에 여러 기능을 제공할 수 있도록 하는 것
		// overloading은 메소드 이름은 같고 매개변수만을 다르게 하는것을 오버로딩이라 한다.
		// 접근제한자나 리턴타입 static이 다르더라도 메소드명이 같고 매개변수가 다르다면 오버로딩이 적용된다.
		// 하지만 리턴타입만! 다르다면 오버로딩이 적용되지 않는다
		ReferenceOverloading ro = new ReferenceOverloading();
		System.out.println(ro.print(1, "dd"));
		System.out.println(ro.print("df", 3));
		System.out.println(print("민석", 1));

		// 왜씀? -> 같은기능하는 메소드를 하나의 이름으로 관리할 수 있다.
		// -> 메소드이름을 절약할 수 있다.
	}

	public int print(int data) {
		return data;
	}

	// 이렇게 리턴타입만 다른경우는 적용되지 않는다.
//	public String print(int data) {
//		return "";
//	}
	public String print(String data) {
		return data;
	}

	private String print(int intData, String StringData) {
		return intData + "번째 : " + StringData;
	}

	private static String print(String StringData, int intData) {
		return StringData + " : " + intData + "번째";
	}

}
