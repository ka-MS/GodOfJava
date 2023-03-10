package chapter10_inheritance.casting;

class Person {
	String name;
	Person(String name){
		this.name = name;
	}
}

// 학생은 사람이다 사람의 모든특징을 상속받는다
class Student extends Person{
	String check;
	Student(String name){
		super(name);
	}
}

// 캐스팅이란 타입 변환을 하는것 
//https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%97%85%EC%BA%90%EC%8A%A4%ED%8C%85-%EB%8B%A4%EC%9A%B4%EC%BA%90%EC%8A%A4%ED%8C%85-%ED%95%9C%EB%B0%A9-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0
public class Casting{
	public static void main(String[] args) {
		
		// 업케스팅
		// 자식 클래스의 객체는 부모클래스의 모든 멤버를 상속받는다
		// 자식 객체는 부모 클래스로 취급될 수 있다.
		// 이때 업캐스팅이란 자식클래스의 객체가 부모클래스 타입으로 형변환 되는것을 말한다
		Student stu = new Student("홍길동");
		Person per = stu; // 부모클래스가 자식객체 stu를 가리키도록 되는것이 업케스팅
		per.name = "이름입니다";
		// per.check 
		// 업케스팅을 통하여 per은 Student객체를 가리키지만 per은 person타입이기 때문에 
		// per로는 Person클래스의 멤버에만 접근이 가능하다 그렇기에 per.check는 에러발생
		
		// 업캐스팅 왜써? 공통적으로 할 수 있는 부분을 만들어 간단하게 다루기 위해서
		//Shape[] s = new Shape[];
		//s[0] = new Rectangle();
		//s[1] = new Rectangle();
		//s[2] = new Triangle();
		//s[3] = new Triangle();
		//s[4] = new Circle();
		//s[5] = new Circle();
		// 예시처럼 하나의 부모에 여러자식객체들을 하나의 자료형으로 관리하면 가독성도 좋고 유지보수성도 좋아진다.
		
		// 다운캐스팅
		// 업캐스팅한 객체를 되돌려 잃어버린 자식객체의 특성을 복구시켜주는것, 업케스팅된것을 원상태로 돌리는것
		Person per2 = new Student("민석"); // 이부분에서 업캐스팅이 실행됨
//		per2.check // 업캐스팅이기때문에 컴파일 오류발생
		Student stu2 = (Student)per2; // 여기서 다운캐스팅 실행 명시적 형변환 필요
		stu2.name = "민석2";
		stu2.check = "확인"; // 다운캐스팅으로 자식객체 멤버 사용가능
		
		
	}
	
}
