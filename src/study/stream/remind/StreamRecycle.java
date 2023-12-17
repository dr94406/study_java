package study.stream.remind;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamRecycle {

    public static void main(String[] args) {

        int[] ints = {1,3,5,7,8,5,2,231,123};
        Stream<Integer> stream = Stream.of(1,3,4,5,6,7,84,42,1,5);
        stream.distinct().sorted().filter(s -> s % 2 == 0).forEach(System.out::println);

    }
}
