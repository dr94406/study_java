package study.whiteship.lambda;

@FunctionalInterface
public interface MyFunction {
    void myMethod();

    default void method(MyFunction f) {
        f.myMethod();

        method(() -> System.out.println("hello"));
    }
}

