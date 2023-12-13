package study.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FindFirst {
  public static void main(String[] args) {

    List<String> strList = List.of("abf","abc","dba","www","eqa","rrr", "abc", "abc");
    strList.stream().filter(s -> s.startsWith("a")).
            filter(d -> d.endsWith("f")).findFirst().stream()
        .collect(Collectors.toList()).forEach(System.out::println);
  }
}
