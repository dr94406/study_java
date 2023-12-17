package study.stream;

import java.util.List;
import java.util.stream.Collectors;

public class MathToAverage {
    public static void main(String[] args) {
        List<Integer> basicMath = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(basicMath.stream().mapToLong(s -> s).sum()); // 합계
        System.out.println(basicMath.stream().mapToLong(s -> s).average().getAsDouble()); // 평균
        System.out.println(basicMath.stream().mapToLong(s -> s).min().getAsLong());
        System.out.println(basicMath.stream().mapToLong(s -> s).max().getAsLong());
    }
}
