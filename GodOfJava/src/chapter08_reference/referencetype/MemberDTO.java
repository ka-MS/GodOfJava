package chapter08_reference.referencetype;

public class MemberDTO {
	public String name;
	public String phone;
	public String email;

	public MemberDTO() {
	}
	
	// this ������? �� ��ü�� ������ ����ҰŴ� ��� ��������� ����
	// Ŭ���� ��ü�� �ν��Ͻ������� �������� �Ű��������� ���Ƶ� this�� ��������ν� ������ ���� ����
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
	
	//�����ڸ� �Ը���� ����� ����غ���!
	
	
}
