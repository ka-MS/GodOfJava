package chapter10_inheritance.overriding;

public class ChildOverriding extends ParentOverriding{
	public ChildOverriding() {
		System.out.println("childOverriding Constructor");
	}
	
	// 자식클래스에서 상속한 부모클래스의 메소드를 똑같이 가져와서 메소드 내용을 수정해 준다 이것이 오버라이드
	// 접근제어자, 리턴타입, 메소드명, 매개변수가 모두 같아야 오버라이딩이 된다!
	// 동일하게 선언한것을 동일한 시그니쳐(signature)를 가진다고 한다
	// 리턴타입을 바꾼다면 메소드명을 변경하던 부모클래스를 수정하던 해야 정상작동이 된다
	@Override // 어노테이션이 없어도 오버라이딩이 되지만 '명시적'으로 나타내 준다 
	public void printName() {
		System.out.println("ChildOverriding printName()");
	}
	
	// private, final, static으 로 지정된 부모메소드는 오버라이딩이되지 않는다
	public void printNames(String name) {
		System.out.println("자식");
	}
	
	@Override
	public void printName2() {
		System.out.println("protected -> public으로 축소해서 오버라이딩은 가능하다");
	}
}
