package chapter10_inheritance.overriding;

public class ParentOverriding {
	
	//오버라이딩이란? 자식클래스에서 부모클래스에 있는 메소드와 동일하게 선언하는것을 오버라이딩이라한다!
	
	public ParentOverriding() {
		System.out.println("ParenrOverriding Constructor");
	}
	
	// 부모클래스의 메소드 생성!
	public void printName() {
		System.out.println("printName() - ParentOverriding");
	}
	
	// private로 지정해주면 overriding할 수 없다
	private void printNames(String name) {
		System.out.println(name);
	}
	
	protected void printName2() {
		System.out.println("printName2() - ParenrOverriding");
	}
}
