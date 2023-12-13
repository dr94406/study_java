package study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> listsStream = list.stream();

        Stream<String> stream = Stream.of("a", "b", "c");
        Stream<String> stream2 = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> stream3 = Arrays.stream(new String[]{"a", "b", "c"});

    }
}
