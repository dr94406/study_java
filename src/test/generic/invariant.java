package test.generic;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class invariant {

  @Test
  void genericTest() {
    List<Integer> list = List.of(1, 2, 3);
//    printCollection(list); 컴파일 에러 발생
  }

  void printCollection(Collection<Object> c) {
    for (Object e : c) {
      System.out.println(e);
    }
  }
}
