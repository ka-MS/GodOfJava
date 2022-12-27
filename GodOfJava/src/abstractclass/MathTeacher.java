package abstractclass;

public class MathTeacher extends Teacher implements ClassTeach, FreshmanDepartment {

	// 선생님으로서의 공통 역할
	@Override
	public void teach() {
		System.out.println("수학선생님");
	}

	// 담임으로서의 역할
	@Override
	public void classTeach() {
		System.out.println("2반 담임선생님");
	}

	@Override
	public void attendance() {
		System.out.println("출석부를 부른다.");
	}

	// 1학년 부서의 역할
	@Override
	public void controllClass() {
		System.out.println("1반부터 4반");

	}

	@Override
	public void freshmanActivity() {
		System.out.println("1학년 대상 성교육");
	}

	@Override
	public void studentConsulting() {
		System.out.println("1학년 상담");
	}

}
