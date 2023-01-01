package chapter16_nestedclass.inner;

public class NestedSample {

	public static void main(String[] args) {
		NestedSample sample = new NestedSample();
		sample.makeStaticNEstedObject();
	}

	public void makeStaticNEstedObject() {
		// static Nested 클래스의 객체는 감싼클래스.내부클래스로 선언하여 생성하면 된다
		// 왜 쓸까? -> 클래스를 묶기 위함!
		OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
		staticNested.setValue(3);
		System.out.println(staticNested.getValue());
	}

	
	// 아래의 경우 처럼 대학교의 학생인지 중학교의 학생인지 불분명할 수 있다. 두 학생은 내부적으로 다른 구현을 해야할 것 이다
	// static Nested클래스로 묶으면 대학교.학생 중학교.학생 처럼 쉽게 구분할 수 있을것이다
	static class University {
		static class Student {

		}
	}

	static class MiddleSchool {
		static class Student {

		}
	}
}
