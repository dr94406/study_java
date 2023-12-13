package study.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamSorted {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift", "Go", "Java");

        Stream<String> streamList = list.stream();

        streamList.sorted(Comparator.naturalOrder()).distinct().forEach(System.out::println);


    }

}
