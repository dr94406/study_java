package study.jungsuk.Generic;

import java.util.List;

public class 반공변 {

  public static  void 반공변(List<? super SuperA> list) {
    list.add(new A("Z"));
  }
  public static void main(String[] args) {

  }
}
