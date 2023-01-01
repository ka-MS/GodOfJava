package chapter13_interface_enum.interfaceclass;

public class InterfaceExample {

	public static void main(String[] args) {
		// 아래처럼 객체를 생성하면 오류가 생긴다. 아무것도 구현되어있지 않은데 왜 초기화 하려는것이냐는 오류!
//		MemberManager member = new MemberManager();
		MemberManager member = new MemberManagerImpl(); // 해당인터페이스를 구현한 클래스를 사용한다
	}

}
