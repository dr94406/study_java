package study.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {
    public static void main(String[] args) {
        List<Integer> arr = List.of(50, 20, 38, 8, 12);
        System.out.println(arr.stream().sorted().collect(Collectors.toList()));
    }
}
