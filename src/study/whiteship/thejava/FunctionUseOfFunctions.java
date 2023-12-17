package study.whiteship.thejava;

import java.util.function.Function;

public class FunctionUseOfFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        /** andthen : 함수 먼저 실행하고, 입력값 실행 (실행함수 우선 실행) **/
        Function<Integer, Integer> plus10Andmultiply = plus10.andThen(multiply2);
        System.out.println(plus10Andmultiply.apply(5));


        /** compose: 입력값을 실행한후, 함수를 실행 (입력함수 우선 실행) **/
        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println(multiply2AndPlus10.apply(2));


    }
}
