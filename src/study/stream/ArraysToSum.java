package study.stream;

import java.util.Arrays;
import java.util.List;

public class ArraysToSum {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 5, 6, 7, 8);
        Long arraySum = array.stream().mapToLong(i -> i).sum();
        System.out.println(arraySum);

    }
}
