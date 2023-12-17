package study.whiteship.thejava;

import java.util.function.Function;

public class FunctionElement{
    public static void main(String[] args) {

        /** 일반 사용 **/
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1));

        /** 람다식 사용 **/
        Function<Integer, Integer> plus10s = (i) -> i + 10;
        System.out.println(plus10s.apply(1));
    }
}
