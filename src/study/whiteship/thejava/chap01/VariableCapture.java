package study.whiteship.thejava.chap01;

import study.interable.Consumer;

import java.util.function.IntConsumer;

public class VariableCapture {
    public static void main(String[] args) {
        VariableCapture variableCapture = new VariableCapture();
        variableCapture.run();

    }

    private void run() {
        final int baseNumber = 10; // final을 생략하려면 실제로 더 이상 변경하지 않아야 한다.

        // 로컬 클래스 (local class)
        class LocalClass {
            void printbaseNumber() {
                int baseNumber = 12; //쉐도잉 없이 rwun에 선언된 변수로 바로 사용 가능
                System.out.println(baseNumber);
            }
        }

        //익명 클래스 (anonymous class)
        Consumer<Integer> integerconsumer = new Consumer<Integer>(){
            @Override
            public void accept(Integer i) {
                int baseNumber = 11;
                System.out.println(i + baseNumber);
            }
        };

        // 람다식 (Lambda)
        IntConsumer printInt = (i) -> {
            // int baseNumber = 1; // 같은 스코프 안에 같은 변수명 사용 불가.
            System.out.println(i + baseNumber);
        };

        new LocalClass().printbaseNumber(); // 12
        integerconsumer.accept(10); // 21
        printInt.accept(10); // 20

    }
}
