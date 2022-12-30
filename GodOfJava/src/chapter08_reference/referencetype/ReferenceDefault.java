package chapter08_reference.referencetype;

public class ReferenceDefault {
	private String arg;
	ReferenceDefault(){}
	ReferenceDefault(String arg){
		this.arg = arg;
	}

	public static void main(String[] args) {
		ReferenceDefault reference = new ReferenceDefault();
		ReferenceDefault reference2 = new ReferenceDefault("생성자");
		System.out.println(reference2.getString());
		// 생성자는 객체를 생성하기 위해 존재한다!
		// 생성자에 입력된 매개변수는 어떻게 사용하지? -> 인스턴스변수를 지정해주고 생성자 매개변수를 this예약어로 연결
	}
	
	public String getString() {
		
		return arg;
	}

}
