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
//https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%97%85%EC%BA%90%EC%8A%A4%ED%8C%85-%EB%8B%A4%EC%9A%B4%EC%BA%90%EC%8A%A4%ED%8C%85-%ED%95%9C%EB%B0%A9-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0
public class Casting{
	public static void main(String[] args) {
		
		// ���ɽ���
		// �ڽ� Ŭ������ ��ü�� �θ�Ŭ������ ��� ����� ��ӹ޴´�
		// �ڽ� ��ü�� �θ� Ŭ������ ��޵� �� �ִ�.
		// �̶� ��ĳ�����̶� �ڽ�Ŭ������ ��ü�� �θ�Ŭ���� Ÿ������ ����ȯ �Ǵ°��� ���Ѵ�
		Student stu = new Student("ȫ�浿");
		Person per = stu; // �θ�Ŭ������ �ڽİ�ü stu�� ����Ű���� �Ǵ°��� ���ɽ���
		per.name = "�̸��Դϴ�";
		// per.check 
		// ���ɽ����� ���Ͽ� per�� Student��ü�� ����Ű���� per�� personŸ���̱� ������ 
		// per�δ� PersonŬ������ ������� ������ �����ϴ� �׷��⿡ per.check�� �����߻�
		
		// ��ĳ���� �ֽ�? ���������� �� �� �ִ� �κ��� ����� �����ϰ� �ٷ�� ���ؼ�
		//Shape[] s = new Shape[];
		//s[0] = new Rectangle();
		//s[1] = new Rectangle();
		//s[2] = new Triangle();
		//s[3] = new Triangle();
		//s[4] = new Circle();
		//s[5] = new Circle();
		// ����ó�� �ϳ��� �θ� �����ڽİ�ü���� �ϳ��� �ڷ������� �����ϸ� �������� ���� ������������ ��������.
		
		// �ٿ�ĳ����
		// ��ĳ������ ��ü�� �ǵ��� �Ҿ���� �ڽİ�ü�� Ư���� ���������ִ°�, ���ɽ��õȰ��� �����·� �����°�
		Person per2 = new Student("�μ�"); // �̺κп��� ��ĳ������ �����
//		per2.check // ��ĳ�����̱⶧���� ������ �����߻�
		Student stu2 = (Student)per2; // ���⼭ �ٿ�ĳ���� ���� ����� ����ȯ �ʿ�
		stu2.name = "�μ�2";
		stu2.check = "Ȯ��"; // �ٿ�ĳ�������� �ڽİ�ü ��� ��밡��
		
		
	}
	
}
