package chapter13_interface_enum.interfaceclass;

public interface MemberManager {
	// 인터페이스는 실제 코드가 아닌 어떤 메소드들이 있는지 정의하력 할 때 사용하게된다
	// static이나 final은 사용할 수 없다
	// 구현된 메소드도 사용할 수 없다
	public boolean addMember(MemberDTO member);
	public boolean removeMember(String name,String phone);
	public boolean updateMember(MemberDTO member);
}
