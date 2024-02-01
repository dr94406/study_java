package study.jungsuk.Generic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class test {
  public static void main(String[] args) {
    List<Parent> arr = new ArrayList<>();
    arr.add(new Parent("zz"));
    arr.add(new Parent("zz2"));
    arr.add(new Parent("zz3"));
    printAllName(arr);
  }

  public static void printAllName(List<Parent> list) {
//    System.out.println(list.stream().map(Parent::getName).collect(Collectors.toList()));
    for (Parent parent : list) {
      System.out.println(parent.name);
    }
  }
}
