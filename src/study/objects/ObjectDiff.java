package study.objects;

import java.util.Objects;

public class ObjectDiff {

  public static void main(String[] args) {
    ObjectTest objectTest = new ObjectTest();


    System.out.println(
        "Objects.nonNull(objectTest.getGood()) = " + Objects.nonNull(objectTest.getGood()));
    System.out.println("Objects.requireNonNull(objectTest.getGood()) = " +
        Objects.requireNonNullElse(objectTest.getGood(), "값이 없을 시 기본값 할당 "));
  }
}
