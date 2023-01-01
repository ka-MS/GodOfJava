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
		// 이런식으로 익명 클래스를 생성하여 사용할 수도 있다!!!
		// 클래스에는 이름이 없지만 인터페이스의 메소드가 구현되어있다
		// 이렇게 구현하면 클래스 이름도 없고 객체 이름도 없기에 다른 메소드에서 참조할 수 없다. 당연히 재사용하려면 다시 선언해야한다
		button.setListener(new EventListener() {
			@Override
			public void onClick() {
				System.out.println("Magic Button Clicked!!");
			}
		});
		button.onClickProcess();
		
		//이렇게 복잡하게 사용하는 이유? -> 클래스를 많이 만들고 호출할수록 메모리를 많이 사용하게된다. 이러한 방식은 메모리 절약에 좋다
	}
	
	// 인터페이스를 구현하는 내부클래스를 별도로 만들어 사용할 수 있다
//	class MagicButtonListener implements EventListener {
//
//		@Override
//		public void onClick() {
//			System.out.println("Magic Button Clicked!!");
//		}
//		
//	}
}
