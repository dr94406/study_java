package study.stream;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapVSMaptoLongTest {
  public static void main(String[] args) {

    Good good = new Good();

    List<Long> longList = List.of(1L , 3L, 4L, 5L, 9l, 10L, 15L);

    List<Good> goodList = new ArrayList<>();
    goodList.add(good);

    // 1.
    System.out.println(longList.stream().map(s -> s).collect(Collectors.toList()));

    // 2.
    System.out.println(goodList.stream().mapToLong(s -> s.age).boxed().collect(Collectors.toList()));
  }

  @Getter
  private static class Good {

    private String face = "face";
    private Integer age = 15;
  }
}
