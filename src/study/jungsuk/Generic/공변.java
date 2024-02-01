package study.jungsuk.Generic;

import java.util.List;

public class 공변 {

  public static void main(String[] args) {

  }

  public static void returnArr(List<? super SuperA> list) {
    list.add(new A("A"));
  }
}
