package study.stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class finaloperation {
    public static void main(String[] args) {
        OptionalInt min = IntStream.of(1, 3, 5, 7, 9).min();
        int max = IntStream.of().max().orElse(0);
        IntStream.of(1, 3, 5, 7, 9).average().ifPresent(System.out::println);

        long count = IntStream.of(1, 3, 5, 7, 9).count();
        long sum = LongStream.of(1, 3, 5, 7, 9).sum();

        System.out.println(count);
        System.out.println(sum);
    }
}
