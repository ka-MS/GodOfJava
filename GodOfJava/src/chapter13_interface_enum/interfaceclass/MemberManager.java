package chapter13_interface_enum.interfaceclass;

public interface MemberManager {
	// �������̽��� ���� �ڵ尡 �ƴ� � �޼ҵ���� �ִ��� �����Ϸ� �� �� ����ϰԵȴ�
	// static�̳� final�� ����� �� ����
	// ������ �޼ҵ嵵 ����� �� ����
	public boolean addMember(MemberDTO member);
	public boolean removeMember(String name,String phone);
	public boolean updateMember(MemberDTO member);
}
