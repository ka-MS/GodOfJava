package chapter16_nestedclass.inner;

public class OuterOfStatic { 
	static class StaticNested { // OuterOfStatic클래스 안에 staticNested 클래스를 선언했다
		// 내부클래스는 외부클래스의 어떤 변수도 접근할 수 있다.
		private int value = 0;
		
		public int getValue() {
			return value;
		}
		
		public void setValue(int value) {
			this.value= value;
		}
	}
	

}
