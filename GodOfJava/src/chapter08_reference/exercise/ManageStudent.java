package chapter08_reference.exercise;

public class ManageStudent {

	public static void main(String[] args) {
		ManageStudent ms = new ManageStudent();	
		Student[] student = null;
		student = ms.addStudent();
		ms.printStudent(student);
	}
	// ms949여서 깃 커밋시에 문자열이 깨지는 현상이 발생했다
	// https://pub-diary.tistory.com/7 - 참고블로그
	// https://kamang-it.tistory.com/entry/EncodingCharacter-Set%EC%97%90-%EB%8C%80%ED%95%B4%EC%84%9C-%EC%95%8C%EC%95%84%EB%B3%B4%EC%9E%90euc-kr-utf8-%EB%93%B1
	// 인코딩은 특정 문자열을 하나의 캐릭터셋의 숫자형태의 나열로 변경하는것
	// 자바 캐릭터셋 설정을 utf-8로 해 주니 ms949로 작성된 파일들 글씨가 모두 깨졌다..
	// 작성되어있는 파일들은 ms949로 재 지정해주고 새로운 파일들은 utf-8로 작성되도록 설정했다..
	// utf-8은 가변길이 인코딩 방식이다 utf16에서 2바이트를 채택한것의 단점(기존국가들의 용량뻥튀기문제)을 보완한것으로 영유럽권은 1바이트로 
	// 경우에따라서 2바이트 3바이트 등등으로 표현하는 것이다.
	
	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("민석");
		student[1] = new Student("민지");
		student[2] = new Student("민주", "송파구", "010", "kk@k.com");
		return student;
	}
	
	public void printStudent(Student[] student) {
		for(int i = 0; i<student.length ; i++) {
			System.out.println(student[i].toString());
		}
	}

}
