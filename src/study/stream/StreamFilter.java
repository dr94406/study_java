package study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {

        List<Integer> IntegerList = Arrays.asList(1, 3, 4, 5, 6, 10, 15, 20);

        Stream<Integer> IntegerStream = IntegerList.stream();
        IntegerStream.filter(s -> s % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
    }
}
