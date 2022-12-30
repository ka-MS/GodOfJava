package chapter10_inheritance.inheritance;

public class ChildArg extends ParentArg{
	
	// 상속받는 부모클래스에 기본생성자가 없어 컴파일 오류가 발생한다. 
	// 여기서 super예약어가 쓰인다 ->super예약어는 부모클래스의 생성자를 호출한다는것을 의미한다.
	// 물론 부모클래스에 기본생성자를 생성해주어도 정상동작ok
	
	public ChildArg() {
		super("민석");
//		super(null); //The constructor ParentArg(String) is ambiguous 
		// -> 부모클래스에 매개변수 생성자가 2개이상이라 모호하다는 오류가난다 어디에 넣어야할지 모른다는것
		
		System.out.println("child constructor");
	}
	//
//	public ChildArg(String name) {
//		super(name);
//	}

}
