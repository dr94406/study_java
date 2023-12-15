package study.basical.statical.optionals;

import java.util.Optional;

public class orElseThrow {


  public static String get() {
    Optional<String> optionalString = Optional.empty();
    return optionalString.orElseThrow(() -> new RuntimeException("없어!"));
  }

  public static void main(String[] args) {
    orElseThrow.get();
  }
}
