package study.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rawStreamToStream {
    public static void main(String[] args) {
        IntStream.range(1, 5).mapToObj(i -> "a" + i);

        Stream.of(1.0, 2.0, 3.0).mapToInt(Double::intValue).mapToObj(i -> "a" + i);


    }
}
