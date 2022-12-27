package abstractclass;

public abstract class Teacher {
	
	// 추상클래스로 선생님의 공통역할을 구현
	public void guide() {
		System.out.println("학생을 지도한다");
	}
	
	// 가르치나 뭘 가르치는지 모르니 추상메소드로 정의
	public abstract void teach();
}
