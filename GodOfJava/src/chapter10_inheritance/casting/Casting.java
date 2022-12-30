package chapter10_inheritance.casting;

class Person {
	String name;
	Person(String name){
		this.name = name;
	}
}

// �л��� ����̴� ����� ���Ư¡�� ��ӹ޴´�
class Student extends Person{
	String check;
	Student(String name){
		super(name);
	}
}

// ĳ�����̶� Ÿ�� ��ȯ�� �ϴ°� 
public class Casting{
	public static void main(String[] args) {
		
		// ���ɽ���
		// �ڽ� Ŭ������ ��ü�� �θ�Ŭ������ ��� ����� ��ӹ޴´�
		// �ڽ� ��ü�� �θ� Ŭ������ ��޵� �� �ִ�.
		// �̶� ��ĳ�����̶� �ڽ�Ŭ������ ��ü�� �θ�Ŭ���� Ÿ������ ����ȯ �Ǵ°��� ���Ѵ�
		Student stu = new Student("ȫ�浿");
		Person per = stu; // �θ�Ŭ������ �ڽİ�ü stu�� ����Ű���� �Ǵ°��� ���ɽ���
		per.name = "�̸��Դϴ�";
//		per.check // ���ɽ����� ���Ͽ� per�� Student��ü�� ����Ű���� per�� personŸ���̱� ������ per�δ� PersonŬ������ ������� ������ �����ϴ� �׷��⿡ per.check�� �����߻�
		
		// �ٿ�ĳ����
		// �Ҿ���� �ڽİ�ü�� Ư���� ���������ִ°�, ���ɽ��õȰ��� �����·� �����°�
		Person per2 = new Student("�μ�"); // �̺κп��� ��ĳ������ �����
//		per2.check // ��ĳ�����̱⶧���� ������ �����߻�
		Student stu2 = (Student)per2; // ���⼭ �ٿ�ĳ���� ���� ����� ����ȯ �ʿ�
		stu2.name = "�μ�2";
		stu2.check = "Ȯ��"; // �ٿ�ĳ�������� �ڽİ�ü ��� ��밡��
		
		
	}
	
}
