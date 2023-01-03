package chapter10_inheritance.dynamic_static_binding;

public class Child extends Parent{
	static void method() {
		System.out.println("child...");
	}
	
	public void method2() {
		System.out.println("Dynamic Child");
	}
}
