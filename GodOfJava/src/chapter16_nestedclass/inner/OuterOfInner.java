package chapter16_nestedclass.inner;

public class OuterOfInner {
	// �Ѻ���δ� static�� �����ۿ� ���̰� ������ �ʴ´�
	class Inner{
		private int value =0;
		public int getValue() {
			
			return value;
		}
		
		public void setValue(int value) {
			this.value = value;
		}
	}

}
