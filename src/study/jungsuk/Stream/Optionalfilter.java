package study.jungsuk.Stream;

import java.util.Optional;

public class Optionalfilter {
  public static void main(String[] args) {
    int result = Optional.of("123").filter(s -> s.length() > 0).map(Integer::parseInt).orElse(-1);
    System.out.println(result);
  }
}
