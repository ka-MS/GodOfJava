package chapter13_interface_enum.util;

public class FinalVariable {
	// final 예약어를 클래스나 메소드에 사용하면 override할 수 없게 하는것
	// 변수에 final을 사용하면? 더이상 바꿀 수 없다라는 뜻 -> 선언과 함께 값을 지정해야 한다
	final int instanceVariable = 1; // 인스턴스변수 생성과 동시에 초기화를 해 주어야 에러가 발생하지 않는다
	public void method(final int parameter) {
		// 매개변수값이나 지역변수는 final을 사용한다 해서 초기화를 바로 해줘야하지는 않다
		final int localVariable;
		localVariable = 1;
		
		// 하지만 메소드 내에서 재 선언하는경우는 컴파일 오류가 발생한다
		// 파라미터값은 넘어오기전에 값이 지정되어서 넘어오고 지역변수는 값을 할당하는순간 변경이 되지 않기떄문이다
//		localVariable = 2;
//		parameter = 0;
	}
}
