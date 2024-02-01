package study.jungsuk.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectTest {
  public static void main(String[] args) {
    String[] strArr = {"aaa", "aaa", "BBB", "BBB", "CCC", "CCC"};
    List<String> stringList = List.of(strArr);
    var stream = stringList.stream();
    System.out.println(stream.distinct().collect(Collectors.toList())); // aaa, BBB, CCC
//    System.out.println(stream.collect(Collectors.toSet())); // aaa, CCC, BBB
  }
}
