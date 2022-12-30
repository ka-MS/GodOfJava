package chapter10_inheritance.inheritance;

public class ParentArg {
	
	
	// 매개변수생성자를 만들고 기본생성자를 생성하지 않는다면? 상속시 기본생성자가 없다는 컴파일 에러가 발생한다.
	public ParentArg(String name) {
		System.out.println("parentArg("+name + ")  Constructor");
	}
	public ParentArg(Integer Age) {
		System.out.println("ParentArg("+Age+") Constructor");
	}
	public void printName() {
		System.out.println("printName() - ParentArg");
	}
}
