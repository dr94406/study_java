package study.whiteship.generic;


public class MainPair {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String> p2 = new OrderedPair<String, String>("hello", "world");

        /** 다이아몬드 연산자 적용하여 타입 추론 **/
        Pair<String, Integer> d1 = new OrderedPair<>("Even", 8);
        Pair<String, String> d2 = new OrderedPair<>("hello", "world");

        /** 제네릭을 타입 파라미터로 사용 **/
        OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<>());


    }
}
