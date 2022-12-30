package chapter08_reference.staticmethod;

public class ReferenceStaticVariable {
	//static 위험성 확인
	static String name;
	public ReferenceStaticVariable() {}
	public ReferenceStaticVariable(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		ReferenceStaticVariable reference = new ReferenceStaticVariable();
		reference.checkName();
	}
	
	
	// 마지막에 호출된값을 클래스 변수에 저장함 이전객체의 값까지 영향을 받음
	// 변수의 스태틱을 제거하면 정상출력되는걸 확인할 수 있음
	public void checkName() {
		ReferenceStaticVariable reference2 = new ReferenceStaticVariable("민석2");
		System.out.println(reference2.name);
		ReferenceStaticVariable reference1 = new ReferenceStaticVariable("민석1");
		System.out.println(reference2.name);
	}

}
