package study.whiteship.thejava.chap03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSorted {

  public static void main(String[] args) {
    List<String> sortedList = new ArrayList<>();
    sortedList.add("esjo");
    sortedList.add("joe");
    sortedList.add("cho");
    Stream<String> stream = sortedList.stream().map(String::toUpperCase);
    // 데이터는 바뀌지 않음.
    sortedList.forEach(System.out::println);

//    sortedList.stream().map((s) -> {
//      System.out.println(s);
//      return s.toUpperCase();
//    });

    System.out.println(sortedList.stream().map((s) -> {
//      System.out.println(s);
      return s.toUpperCase();
    }).collect(Collectors.toList()));
  }
}
