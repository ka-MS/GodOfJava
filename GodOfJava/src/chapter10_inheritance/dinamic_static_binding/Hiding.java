package chapter10_inheritance.dinamic_static_binding;

public class Hiding{
    public static void test() {
        System.out.println("A test()");
    }
}

class B extends Hiding{
    public static void test() {
        System.out.println("B test()");
    }
}
