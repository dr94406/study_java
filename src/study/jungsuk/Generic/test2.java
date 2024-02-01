package study.jungsuk.Generic;

import java.util.ArrayList;
import java.util.List;

public class test2 {
  public static void printAllNameArray(Parent[] arr) {
    for (Parent parent : arr) {
      System.out.println(parent.name);
    }
  }

  public static void printAllNameList(List<? extends Parent> list) {
    for (Parent parent : list) {
      System.out.println(parent.name);
    }
  }

  public static void addNewChild(List<? super Parent> list) {
    list.add(new Child("A"));
  }

  public static void main(String[] args) throws Exception {
    Child c1 = new Child("가");
    Child c2 = new Child("나");
    Child c3 = new Child("다");
    Child[] arr = {c1, c2, c3};
    ArrayList<Child> list = new ArrayList<>();
    list.add(c1);
    list.add(c2);
    list.add(c3);
    printAllNameArray(arr);
    printAllNameList(list); // 컴파일 에러
  }
}
