package study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamdistinct {
    public static void main(String[] args) {

        List<Integer> IntegerList = Arrays.asList(1, 5, 8, 4, 10, 3, 5, 4, 3, 1);

        /** [1, 5, 8, 4, 10, 3] **/
       Stream<Integer> IntegerStream = IntegerList.stream();
       IntegerStream.distinct().collect(Collectors.toList());
    }
}
