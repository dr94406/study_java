package study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysToMapLong {
    public static void main(String[] args) {
        List<Integer> arrList = Arrays.asList(1, 5, 6, 7, 8, 9, 10);
        System.out.println(arrList.stream().mapToLong(s -> s).boxed().collect(Collectors.toList()));
        System.out.println(arrList.stream().mapToInt(s -> s).boxed().collect(Collectors.toList()));
    }
}
