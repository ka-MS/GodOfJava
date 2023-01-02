package chapter08_reference.passby;

import chapter08_reference.referencetype.MemberDTO;

public class ReferencePass {

	// pass by value�� ���� �����Ѵٴ� ��
	// ����ó�� �޼ҵ��� �Ű����������� �ѱ涧���� ���� ���� ���ΰ� ���޵Ǵ°��� ��¥�ΰ�ó�� ������ �������� ����������
	// �⺻�ڷ����� ������ passbyvalue�� ���������� �����ڷ�����?
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
		a= 20; // ���⼭ �����͸� ���������� callPassByValue�� �������� �����Ű���� ���Ѵ�
		b = "z"; //�ֵ���ǥ�ȿ� �ִ´ٴ°��� String b = new String("z"); �� ���� ���ο� ��ü�� �����Ѵٴ� �ǹ�
		System.out.println("in passByValue");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	// �����ڷ����� ������ ����
	// �����ڷ����� �����ǰ��� ������ �����Ѵ�
	public void callPassByReference() {
		MemberDTO member = new MemberDTO("�μ�"); // 1.member��ü ����
		System.out.println("before passByReference");
		System.out.println("member.name = " + member.name); // 2. member ��ü ȣ�� �μ����
		System.out.println("after passByReference");
		passByRefernce(member); // 3. passByReference�޼ҵ忡 �Ű������� member��ü(�μ�) ����
		System.out.println("after passByReference");
		System.out.println("member.name = " + member.name); // 6. �޼ҵ尡 �������� member.name���� ������ �μ�2 
	}
	
	public void passByRefernce(MemberDTO member) {
		member.name = "�μ�2"; // 4. call���� ������ member��ü(�μ�)�� �Ű������� �ް� name���� �μ�2 �Է�
		System.out.println("in passByReference");
		System.out.println("member.name = "+ member.name); // 5. member.name �μ�2 ȣ��
	}

}
