package chapter16_nestedclass.inner;

public class OuterOfStatic { 
	static class StaticNested { // OuterOfStaticŬ���� �ȿ� staticNested Ŭ������ �����ߴ�
		// ����Ŭ������ �ܺ�Ŭ������ � ������ ������ �� �ִ�.
		private int value = 0;
		
		public int getValue() {
			return value;
		}
		
		public void setValue(int value) {
			this.value= value;
		}
	}
	

}
