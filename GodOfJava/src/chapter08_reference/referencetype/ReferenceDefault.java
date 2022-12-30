package chapter08_reference.referencetype;

public class ReferenceDefault {
	private String arg;
	ReferenceDefault(){}
	ReferenceDefault(String arg){
		this.arg = arg;
	}

	public static void main(String[] args) {
		ReferenceDefault reference = new ReferenceDefault();
		ReferenceDefault reference2 = new ReferenceDefault("������");
		System.out.println(reference2.getString());
		// �����ڴ� ��ü�� �����ϱ� ���� �����Ѵ�!
		// �����ڿ� �Էµ� �Ű������� ��� �������? -> �ν��Ͻ������� �������ְ� ������ �Ű������� this������ ����
	}
	
	public String getString() {
		
		return arg;
	}

}
