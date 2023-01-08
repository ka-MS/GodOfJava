package chapter10_inheritance.dynamic_static_binding;

public class StaticBindingTest {
	/* 
	 * 바인딩이란 프로그램에 사용된 구성요소의 실제값 또는 프로퍼티를 결정짓는 행위를 의미함
	 * -> 프로퍼티란?? 
	 * 정적바인딩이란 compile-time에 발생하고 runtime동안에는 변하지 않는 상태로 유지되는 바인딩이다
	 * static private final 메소드는 정적 바인딩 대상이다
	 * static 메소드는 오버라이딩 할 수 없다 why?
	 * static 메소드는 컴파일시, 메모리에 올라가고 메소드 영역에 존재한다
	 * 즉, 객체 생성과 관련이 없고 해당 클래스로부터의 모든 인스턴스가 공유한다 
	 * -> 컴파일시 결정되어있는 상태이므로 런타임에 변화해야하는 오버라이딩은 당연히 안되는것 -> 하이딩이란 방법으로 가능은 하나 쓰지않는다.
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
		
		// 이처럼 오버로딩된 메소드는 타입 정보만을 가지고 바인딩됨 
		test.method(parent);
		test.method(child);
		
		parent.method(); // child 클래스에서 오버로딩됨
	}

}


