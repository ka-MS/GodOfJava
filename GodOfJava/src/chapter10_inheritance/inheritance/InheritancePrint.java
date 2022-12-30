package chapter10_inheritance.inheritance;

public class InheritancePrint {

	public static void main(String[] args) {
//		Child child = new Child();
//		child.printName();
//		ChildPrint childPrint = new ChildPrint();
//		childPrint.printAge();
		ChildArg childArg = new ChildArg();
		childArg.printName();
		// 부모생성자 실행 -> 자식생성자 실행 -> 부모클래스의 printName() 메소드실행
		// 만약 상속을 하지 않았다면 이름을 출력해야할때마다 printName을 만들어야 했을것 그리고 수정또한 각각의 클래스에서 해야했을것
		// 자바에서는 다중상속이 불가하며 extends 예약어를 사용해야함
	}

}
