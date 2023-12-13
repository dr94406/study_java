package study.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ForEachvsMap {

  public static void main(String[] args) {


    List<String> strList = List.of("khm", "khmgoodboy","jy");

    strList.forEach(x -> x.startsWith("k".toUpperCase()));


  }
}
