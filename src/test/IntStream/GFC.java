package test.IntStream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GFC {

    @Test
    void test() {
      int n  = 7;
      int n2 = 8;
        List<Integer> list1 = List.of(n);
        List<Integer> list2 = List.of(n2);


        var collect = list1.stream().filter(s -> s % 2 == 1).reduce(0, Integer::sum);
        System.out.println(collect);

    }
}
