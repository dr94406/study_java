package study.stream;

import java.util.Arrays;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 3, 4, 6, 8, 9, 5);
        System.out.println(integerList.stream().filter(x -> x % 2 == 0).sorted().mapToLong(d -> d).sum());
    }
}
