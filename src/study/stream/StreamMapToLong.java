package study.stream;

import java.util.stream.Stream;

public class StreamMapToLong {
    public static void main(String[] args) {
        Stream<Integer> IntegerStream = Stream.of(1, 5, 6, 7, 8, 9, 10, 15, 20, 25);

        /** LongStream으로 변환 **/
        IntegerStream.mapToLong(s -> s).forEach(System.out::println);

        /** Long으로 변환 **/
        Long sum = IntegerStream.mapToLong(s -> s).sum();
        System.out.println(sum);
    }
}
