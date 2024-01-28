package study.whiteship.thejava.chap01;

public class Main {

    public static void main(String[] args) {
        /**익명 내부 클래스 anonymous inner class **/

        // 자바 8 이전
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello");
            }
        };

        // 자바 8
        RunSomething runSomething2 = () -> System.out.println("Hello");

        RunSomething runSomething3 = () ->{
            System.out.println("hello");
            System.out.println("Bye");
        };

        runSomething.doIt();
        runSomething2.doIt();
        runSomething3.doIt();
    }
}
