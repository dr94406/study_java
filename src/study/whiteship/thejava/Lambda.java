package study.whiteship.thejava;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Lambda {
    Supplier<Integer> get10 = () -> {
        return 10;
    };

    //함수 1줄
    Supplier<Integer> get10s = () -> 10;

    // 파라미터 2개 이상
    BinaryOperator<Integer> sum = (a, b) -> a + b;

    // 타입 명시 가능하지만 선언부의 타입으로 유추 가능해서 생략
    BinaryOperator<Integer> suM = (Integer a, Integer b) -> a + b;

}
