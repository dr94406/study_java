package study.whiteship.interable;

public interface CustomInterface {

    void method1();

    default void method2() {
        method4();
        method5();
        System.out.println("Default method 2");
    }

    static void method3() {
        method5();
        System.out.println("static method");
    }

    private static void method4() {
        System.out.println("private method4");
    }

    private static void method5(){
        System.out.println("private static mehtod");
    }
}
