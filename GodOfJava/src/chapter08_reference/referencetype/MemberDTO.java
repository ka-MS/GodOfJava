package chapter08_reference.referencetype;

public class MemberDTO {
	public String name;
	public String phone;
	public String email;

	public MemberDTO() {
	}
	
	// this 예약어란? 이 객체의 변수를 사용할거다 라고 명시적으로 지정
	// 클래스 객체의 인스턴스변수와 생성자의 매개변수명이 같아도 this를 사용함으로써 구분이 쉽게 가능
	public MemberDTO(String name) {
		this.name = name;
	}

	public MemberDTO(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public MemberDTO(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
	//생성자를 입맛대로 만들어 사용해보자!
	
	
}
