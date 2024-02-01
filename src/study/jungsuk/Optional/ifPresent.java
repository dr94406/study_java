package study.jungsuk.Optional;

import java.util.Optional;

public class ifPresent {
  public static void main(String[] args) {
    String str = "qwer";
    Optional.ofNullable(str).ifPresent(System.out::println);
  }
}
