package chapter10_inheritance.dinamic_static_binding;

public class DynamicBindingTest {
	// 동적바인딩은 다형성을 사용하여 메소드를 호출할 떄 발생한다 
	// 런타임시 , 즉 실행시점에 성격이 결정된다
	// Child클래스는 method2를 오버라이딩했다.  변수 타입은 Parent 이지만 실제로는 child객체이므로 child가 오버라이딩한 메소드를 호출한다.
	// 컴파일러는 실제 객체가 무엇인지 컴파일시간동안에는 판단할 수 없으므로 실행시점까지 바인딩을 미루게 된다

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.method2();

	}

}
