package chapter08_reference.exercise;

public class ManageStudent {

	public static void main(String[] args) {
		ManageStudent ms = new ManageStudent();	
		Student[] student = null;
		student = ms.addStudent();
		ms.printStudent(student);
	}

	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("�μ�");
		student[1] = new Student("����");
		student[2] = new Student("�μ�", "����", "010", "kk@k.com");
		return student;
	}
	
	public void printStudent(Student[] student) {
		for(int i = 0; i<student.length ; i++) {
			System.out.println(student[i].toString());
		}
	}

}
