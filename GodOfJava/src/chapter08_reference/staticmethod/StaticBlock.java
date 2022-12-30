package chapter08_reference.staticmethod;

public class StaticBlock {
	static int data = 1;
	public StaticBlock() {
		System.out.println("StaticBlock contructor.");
	}
	
	static {
		System.out.println("*** First static block ***");
		data = 3;
	}
	
	static {
		System.out.println("*** Second static block ***");
	}
	
	public static int getData() {
		return data;
	}
}
