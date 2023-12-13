package study.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class multipleArray {

    public static void main(String[] args) {
        Stream<String[]> strStream = Stream.of(new String[] {"a","b","c"}, new String[] {"d", "e", "f"});

        Stream<Stream<String>> stream = strStream.map(Arrays::stream);

        Stream<String> stream1 = strStream.flatMap(Arrays::stream);
    }
}
