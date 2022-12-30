package god8.staticmethod;

public class StaticBlockCheck {
	// ����ƽ ����� ��ü ���� �� ȣ��Ǹ�  �� �ѹ��� ����ȴ�
	public static void main(String[] args) {
		StaticBlockCheck check = new StaticBlockCheck();
		System.out.println(StaticBlock.getData()); // �����ڸ� ȣ������ �ʾƵ� ����ȴ�
		check.makeStaticBlockObject(); // ���ķδ� ȣ�� ���� �ʴ´�
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
