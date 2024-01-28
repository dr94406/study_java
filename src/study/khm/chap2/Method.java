package study.khm.chap2;

public class Method {

    /**메서드는 무엇일까?
     * 함수라고 불리기도 하고, 필요한 것을 적재 적소에 사용하기 위해 한 곳에 묶어 둔 것이다.
     * 아까 전 배운 연산자를 사용한다는 것에 목적을 두고 메서드를 만들어 보자.
     */

    public int add(int a, int b) {
        return a + b;
    }

    public int remove(int a, int b) {
        return a- b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static int dividing(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        /** 만든 메소드를 사용하기 위해 객체를 하나 만들어 호출했다
         *  스태틱 메소드가 아니라면, 이런식으로 객체를 생성 해 주어야 한다.
         * **/
        Method method = new Method();
        System.out.println(method.add(10, 20));
        System.out.println(method.remove(10, 20));
        System.out.println(method.multiply(10, 20));
        System.out.println(method.dividing(10, 20));

    }
}
