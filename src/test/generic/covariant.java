package test.generic;

import org.junit.jupiter.api.Test;

public class covariant {

  @Test
  void genericTest() {
    Integer[] integers = new Integer[] {1, 2, 3};
    printArray(integers);
  }

  void printArray(Object[] arr) {
    for (Object object : arr) {
      System.out.println(object);
    }
  }
}
