package study.stream;

import java.util.stream.IntStream;

public class StreamPeek {
    public static void main(String[] args) {
        int sum = IntStream.of(1, 3, 5, 7, 9).sum();
        System.out.println(sum);
    }
}
