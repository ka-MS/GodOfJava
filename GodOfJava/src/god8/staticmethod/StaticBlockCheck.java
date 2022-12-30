package god8.staticmethod;

public class StaticBlockCheck {
	// 스태틱 블록은 객체 생성 후 호출되면  딱 한번만 실행된다
	public static void main(String[] args) {
		StaticBlockCheck check = new StaticBlockCheck();
		System.out.println(StaticBlock.getData()); // 생성자를 호출하지 않아도 실행된다
		check.makeStaticBlockObject(); // 이후로는 호출 되지 않는다
		check.makeStaticBlockObject();
	}
	
	public void makeStaticBlockObject() {
		System.out.println("Creating block1");
		StaticBlock block1 = new StaticBlock();
		System.out.println("Created block1");
		System.out.println("-------------");
		System.out.println("Creating block2");
		StaticBlock block2 = new StaticBlock();
		System.out.println("Created block2");
	}

}
