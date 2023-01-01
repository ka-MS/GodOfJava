package chapter13_interface_enum.abstractclass;

import chapter13_interface_enum.interfaceclass.MemberDTO;

public abstract class MemberMangerAbstract {
	// abstract클래스는 마음대로 초기화하고 실행 할 수 없도록 되어있음
	// interface와 달리 구현된 메소드가 있어도 상관없다
	// abstract메소드가 없어도 abstract클래스 선언이 가능하지만 하나라도 있으면 무조건 abstract클래스로 선언해야한다
	// java에서는 다중상속을 하려는 경우 어떤걸 상속받아야 하는지 모르는 상태인 다이아몬드문제가 발생한다 c에서는 다중상속이 가능하다 -구현체
	// 인터페이스가 다중상속이가능한이유? 인터페이스 안에는 구현체가 없기 때문에 상속받은 메소드가 누구것인지 알 필요가 없다 어차미 자식객체에서 구현을 할것이기 때문이다!!
	// abstract는 클래스이기때문에 당연히 다중상속이 되지 않는다
	public abstract boolean addMember(MemberDTO member);
	public abstract boolean removeMember(String name, String phone);
	public abstract boolean updateMember(MemberDTO member);
	public void printLog(String data) {
		System.out.println("Data = " + data);
	}
	
}
