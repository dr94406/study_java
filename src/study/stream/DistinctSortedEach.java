package study.stream;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class DistinctSortedEach {
    public static void main(String[] args) {


        /** stream **/
        IntStream intStream = IntStream.of(10, 5, 6, 5);
        intStream.distinct().sorted().forEach(System.out::println);


    }
}
