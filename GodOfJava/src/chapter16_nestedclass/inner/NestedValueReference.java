package chapter16_nestedclass.inner;

import chapter16_nestedclass.anonymous.EventListener;

public class NestedValueReference {
	public int publicInt = 0;
	protected int protectedInt = 1;
	int justInt= 2;
	private int privateInt = 3;
	static int staticInt = 4;
	
	// static NestedŬ����������  ���ΰ��ִ� Ŭ������ static������ ��밡��!
	static class StaticNested{
		public void setValue() {
			staticInt = 14;
//			justInt = 0; 
		}
	}
	
	//����Ŭ������ �͸�Ŭ���������� ���ΰ��ִ� Ŭ������ ��� ������ ������ �� �ִ�
	class Inner{
		public void setValue() {
			publicInt = 20;
			protectedInt = 21;
			justInt = 22;
			privateInt = 23;
			staticInt = 24;
		}
	}
	
	public void setValue() {
		EventListener listener = new EventListener() {

			@Override
			public void onClick() {
				publicInt = 30;
				protectedInt = 31;
				justInt = 32;
				privateInt =33;
				staticInt = 34;
			}
			
		};
	}

}
