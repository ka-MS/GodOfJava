package chapter13_interface_enum.util;

import chapter13_interface_enum.interfaceclass.MemberDTO;

public class FinalReferenceType {
	// ������ ������ final�� �ٿ� �����ϸ�?
	final MemberDTO dto = new MemberDTO();
	public static void main(String[] args) {
		FinalReferenceType fr = new FinalReferenceType();
		fr.checkDTO();
	}
	
	// 
	public void checkDTO() {
		System.out.println(dto);
//		dto = new MemberDTO(); //��ü ������ϸ� ���� �Ҵ� �� �����ٴ� ������ �߻��Ѵ�.
		
		// ��ü ���� ������ ���� �������ִ°� �����ұ�?
		dto.name = "�μ�";
		System.out.println(dto);
		dto.name = "�μ�2";
		System.out.println(dto);
		// �����ϴ�! MemeberDTO��ü�� final�� ����Ǿ������� �� ���� �������� final ������ �ƴϱ� ����
		// Ŭ������ final����ȴ� �ؼ� �� �ȿ��ִ°͵���� final�� �Ǵ°��� �ƴϴ�
	}
}
