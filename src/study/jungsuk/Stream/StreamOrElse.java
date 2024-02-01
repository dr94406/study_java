package study.jungsuk.Stream;

import java.util.Optional;

public class StreamOrElse {
  public static void main(String[] args) {
    String test = null;
    Optional<String> optional = Optional.ofNullable(test);
    String str3 = optional.orElseGet(String::new);
    System.out.println(str3);
  }
}
