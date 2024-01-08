package study.whiteship.thejava.chap01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodReference {

    private String name;

    public MethodReference() {
    }

    public MethodReference(String name) {
        this.name = name;
    }

    static String hi(String name) {
        return "hi" + name;
    }

    static String hello(String name) {
        return "Hello " + name;
    }



    public static void main(String[] args) {
        /** 스태틱 메소드 참조 => 타입:: 스태틱 메소드 **/
        UnaryOperator<String> hi = MethodReference::hi;
        System.out.println(hi.apply("hyeongmin"));

        /** 특정 객체의 인스턴스 메소드 참조 ⇒ 객체 레퍼런스::인스턴스 메소드 **/
        MethodReference methodReference = new MethodReference();
        UnaryOperator<String> hello = MethodReference::hello;
        System.out.println(hello.apply("hyeongmin!"));

        /** 임의 객체의 인스턴스 메소드 참조 => 타입::인스턴스 메서드 **/
        String[] names = {"khm","gogo","le"};
        // 1. 익명 함수
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0; // 구현
            }
        });

        // 2. 람다식
        Arrays.sort(names, (o1, o2) -> {
            return 0;
        });

        // 3. 메소드 참조
        /** - compareToIgnoreCase : 자기 자신과 파라미터 String 값을 비교해서 Int 값에 넘김
            - compare함수와 파라미터 + 리턴값이 동일 **/
        Arrays.sort(names, String::compareToIgnoreCase); // arraysList 내부의 임의 객체들을 참조

        // 4. 생성자 참조 => 타입::new

        /** 기본 생성자 (파라미터 X) **/
        Supplier<MethodReference> newMethodReference = MethodReference::new;
        MethodReference methodReference1 = newMethodReference.get();

        /** 파라미터 있는 생성자 **/
        Function<String, MethodReference> newMethodReference2 = MethodReference::new;
        MethodReference methodReference2 = newMethodReference2.apply("a");

        // => 메서드 레퍼런스 만으로 판단하기 어렵다.


    }

}
