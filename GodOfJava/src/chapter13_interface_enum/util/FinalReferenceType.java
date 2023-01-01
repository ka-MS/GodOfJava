package chapter13_interface_enum.util;

import chapter13_interface_enum.interfaceclass.MemberDTO;

public class FinalReferenceType {
	// 참조형 변수에 final을 붙여 선언하면?
	final MemberDTO dto = new MemberDTO();
	public static void main(String[] args) {
		FinalReferenceType fr = new FinalReferenceType();
		fr.checkDTO();
	}
	
	// 
	public void checkDTO() {
		System.out.println(dto);
//		dto = new MemberDTO(); //객체 재생성하면 값을 할당 할 수없다는 오류가 발생한다.
		
		// 객체 안의 변수들 값을 변경해주는건 가능할까?
		dto.name = "민석";
		System.out.println(dto);
		dto.name = "민석2";
		System.out.println(dto);
		// 가능하다! MemeberDTO객체는 final로 선언되어있지만 그 안의 변수들은 final 선언이 아니기 때문
		// 클래스가 final선언된다 해서 그 안에있는것들까지 final이 되는것은 아니다
	}
}
