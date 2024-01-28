package study.khm.chap2;

public class StaticMethod {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        /** 스태틱 메소드는 객체를 생성하지 않아도 호출 할 수 있다. **/
        StaticMethod.add(1, 5);
    }
}
