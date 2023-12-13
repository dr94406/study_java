package study.stream;

import study.interable.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[0]);
        consumer.andThen(System.out::println).accept("Hello World!!!!!");
    }
}
