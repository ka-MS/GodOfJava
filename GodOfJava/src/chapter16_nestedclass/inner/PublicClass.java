package chapter16_nestedclass.inner;

public class PublicClass {

}
// Nested클래스를 사용하는 이유 -> 코드를 간단하게 표현하기 위함
// Static nested 클래스아 inner 클래스로 구분됨
// inner클래스는 다시 두가지로 나뉨 
	// 1. local inner class 이름이 있는 로컬 내부 클래스
	// 2. anonymous inner class 이름이없는 익명  클래스
// 왜쓰나?
	// 1. 한 곳에서만 사용되는 클래스를 논리저으로 묶어서 처리할 필요가 있을때
	// 2. 캡슐화가 필요할 때 - 캡슐화란?? 객체의 속성(fields)과 행위(method)를 하나로 묶고 실제 구현 내용 일부를 외부에 감추어 은닉한다. 연관되는 변수, 함수를 Class로 묶는작업
		// 인터페이스와 구현을 분리한다는것은 변경될만한 요소를 객체 내부에 꽁꽁 숨겨둔다는것
class JustNotPublicClass {
	// 이건 내부클래스가 아닌 그냥 클래스다 public이 아닐 뿐이다.

}
