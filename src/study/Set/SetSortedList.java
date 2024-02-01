package study.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetSortedList {

  public static void main(String[] args) {
    Set<String> stringSetList = new HashSet<>();
    stringSetList.add("Khm");
    stringSetList.add("K1hm");
    stringSetList.add("K2hm");
    stringSetList.add("Kh4m");
    stringSetList.add("Kh4m");


    stringSetList.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
  }
}
