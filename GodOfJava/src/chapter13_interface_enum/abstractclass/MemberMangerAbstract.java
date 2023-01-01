package chapter13_interface_enum.abstractclass;

import chapter13_interface_enum.interfaceclass.MemberDTO;

public abstract class MemberMangerAbstract {
	// abstractŬ������ ������� �ʱ�ȭ�ϰ� ���� �� �� ������ �Ǿ�����
	// interface�� �޸� ������ �޼ҵ尡 �־ �������
	// abstract�޼ҵ尡 ��� abstractŬ���� ������ ���������� �ϳ��� ������ ������ abstractŬ������ �����ؾ��Ѵ�
	// java������ ���߻���� �Ϸ��� ��� ��� ��ӹ޾ƾ� �ϴ��� �𸣴� ������ ���̾Ƹ�幮���� �߻��Ѵ� c������ ���߻���� �����ϴ� -����ü
	// �������̽��� ���߻���̰���������? �������̽� �ȿ��� ����ü�� ���� ������ ��ӹ��� �޼ҵ尡 ���������� �� �ʿ䰡 ���� ������ �ڽİ�ü���� ������ �Ұ��̱� �����̴�!!
	// abstract�� Ŭ�����̱⶧���� �翬�� ���߻���� ���� �ʴ´�
	public abstract boolean addMember(MemberDTO member);
	public abstract boolean removeMember(String name, String phone);
	public abstract boolean updateMember(MemberDTO member);
	public void printLog(String data) {
		System.out.println("Data = " + data);
	}
	
}
