package study.khm.chap2;

public class operator {
    public static void main(String[] args) {
        /** 연산자의 종류에는 여러가지가 있다
         * 더하기, 빼기, 곱하기, 나누기, 전위 연산자, 후위 연산자, 증감연산자, 감소연산자 등등
        **/

        int value = 150;

        /** 더하기 연산자 **/
        System.out.println(value + 100); // 250

        /** 빼기 연산자 **/
        System.out.println(value - 50); // 100

        /** 곱하기 연산자 **/
        System.out.println(value * 100); // 15000

        /** 나누기 연산자 **/
        System.out.println(value / 5); // 30

        /** 전위 증감 연산자 **/
        System.out.println(value);
        System.out.println(++value);

        /**후위 감소 연산자 **/
        System.out.println(value--);
        System.out.println(value);
    }
}
