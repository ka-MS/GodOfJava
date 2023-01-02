package chapter08_reference.passby;

import chapter08_reference.referencetype.MemberDTO;

public class ReferencePass {

	// pass by value는 값만 전달한다는 뜻
	// 예제처럼 메소드의 매개변수값으로 넘길때에는 원래 값은 놔두고 전달되는값이 진짜인것처럼 하지만 원래값은 변하지않음
	// 기본자료형은 무조건 passbyvalue로 데이터전달 참조자료형은?
	public static void main(String[] args) {
		int x=5; 
		ReferencePass rp = new ReferencePass();
		rp.callPassByValue();
		System.out.println("-----------------------");
		rp.callPassByReference();
		
		System.out.println();
		rp.doS(x);
		System.out.println(x);
	}
	
	public void doS(int x) {
		System.out.println("dos = " +x++);
	}
	public void callPassByValue() {
		int a = 10;
		String b = "b";
		System.out.println("before passByValue");
		System.out.println("a="+a);
		System.out.println("b="+b);
		passByValue(a, b); // 
		System.out.println("after passByValue");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	public void passByValue(int a, String b) {
		System.out.println(a);
		a= 20; // 여기서 데이터를 변경하지만 callPassByValue의 변수값을 변경시키지는 못한다
		b = "z"; //쌍따옴표안에 넣는다는것은 String b = new String("z"); 와 같은 새로운 객체를 생성한다는 의미
		System.out.println("in passByValue");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	// 참조자료형은 참조를 저장
	// 참조자료형은 원래의값에 참조를 전달한다
	public void callPassByReference() {
		MemberDTO member = new MemberDTO("민석"); // 1.member객체 생성
		System.out.println("before passByReference");
		System.out.println("member.name = " + member.name); // 2. member 객체 호출 민석출력
		System.out.println("after passByReference");
		passByRefernce(member); // 3. passByReference메소드에 매개변수로 member객체(민석) 전달
		System.out.println("after passByReference");
		System.out.println("member.name = " + member.name); // 6. 메소드가 끝났지만 member.name값은 여전히 민석2 
	}
	
	public void passByRefernce(MemberDTO member) {
		member.name = "민석2"; // 4. call에서 생성한 member객체(민석)를 매개변수로 받고 name값에 민석2 입력
		System.out.println("in passByReference");
		System.out.println("member.name = "+ member.name); // 5. member.name 민석2 호출
	}

}
