package chapter16_nestedclass.anonymous;

public class MagicButton {
	public  MagicButton() {
		
	}
	public EventListener listener;
	public void setListener(EventListener listener) {
		this.listener = listener;
	}
	public void onClickProcess() {
		if(listener !=null) {
			listener.onClick();
		}
	}
}
