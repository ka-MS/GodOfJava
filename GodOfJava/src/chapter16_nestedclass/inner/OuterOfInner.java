package chapter16_nestedclass.inner;

public class OuterOfInner {
	// 겉보기로는 static의 유무밖에 차이가 보이지 않는다
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
