package study.jungsuk.Optional;

import java.util.Optional;

public class CreateOptional {
  public static void main(String[] args) {
    String java = null;
    Optional<String> optional = Optional.of(java);
    System.out.println(optional.orElseThrow(() -> new RuntimeException("of")));
    Optional<String> optional2 = Optional.ofNullable(java);
    System.out.println(optional2.orElseThrow(() -> new RuntimeException("ofNullable")));

  }
}
