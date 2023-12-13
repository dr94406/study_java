package study.stream;

import java.util.stream.Stream;

public class StreamAnyMatch {
    public static void main(String[] args) {

        Stream<Integer> mathstream = Stream.of(1, 2, 3, 4, 5);

        Boolean anyMatch = mathstream.anyMatch(s -> s % 2 == 0);
        System.out.println(anyMatch);

        Boolean AllMatch = mathstream.allMatch(s -> s % 2 == 0);
        System.out.println(AllMatch);
    }
}
