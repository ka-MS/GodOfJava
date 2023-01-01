package chapter16_nestedclass.anonymous;

public class AnonymousSample {
	public static void main(String[] args) {
		AnonymousSample sample = new AnonymousSample();
		sample.setButtonListener();
	}

	public void setButtonListener() {
		MagicButton button = new MagicButton();
//		MagicButtonListener listener = new MagicButtonListener();
//		button.setListener(listener);
		// �̷������� �͸� Ŭ������ �����Ͽ� ����� ���� �ִ�!!!
		// Ŭ�������� �̸��� ������ �������̽��� �޼ҵ尡 �����Ǿ��ִ�
		// �̷��� �����ϸ� Ŭ���� �̸��� ���� ��ü �̸��� ���⿡ �ٸ� �޼ҵ忡�� ������ �� ����. �翬�� �����Ϸ��� �ٽ� �����ؾ��Ѵ�
		button.setListener(new EventListener() {
			@Override
			public void onClick() {
				System.out.println("Magic Button Clicked!!");
			}
		});
		button.onClickProcess();
		
		//�̷��� �����ϰ� ����ϴ� ����? -> Ŭ������ ���� ����� ȣ���Ҽ��� �޸𸮸� ���� ����ϰԵȴ�. �̷��� ����� �޸� ���࿡ ����
	}
	
	// �������̽��� �����ϴ� ����Ŭ������ ������ ����� ����� �� �ִ�
//	class MagicButtonListener implements EventListener {
//
//		@Override
//		public void onClick() {
//			System.out.println("Magic Button Clicked!!");
//		}
//		
//	}
}
