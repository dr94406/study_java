package study.whiteship.thejava.chap01;

@FunctionalInterface
public interface RunSomething {

    // 함수형 인터페이스
    void doIt(); // interface abstract 생략 가능.

    // <자바 8 추가>
    // 1. static method
    static void printName() {
        System.out.println("esjo");
    }

    // 2. default method
    default void printAge() {
        System.out.println("25");
    }
}
