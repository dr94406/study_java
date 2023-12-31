package study.jungsuk.Stream;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 스트림을 정렬하는 다양한 방법  23-12-28 18:38 **/
public class Sorted {

  public static void main(String[] args) {


    Stream<String> practice = Stream.of("dd", "aaa", "CC", "cc", "b");
    Stream<String> practice2 = Stream.of("dd", "aaa", "CC", "cc", "b");
    Stream<String> practice3 = Stream.of("dd", "aaa", "CC", "cc", "b");
    Stream<String> practice4 = Stream.of("dd", "aaa", "CC", "cc", "b");
    Stream<String> practice5 = Stream.of("dd", "aaa", "CC", "cc", "b");
    Stream<String> practice6 = Stream.of("dd", "aaa", "CC", "cc", "b");
    Stream<String> practice7 = Stream.of("dd", "aaa", "CC", "cc", "b");


    // 정순 정렬
    System.out.println(practice.sorted().collect(Collectors.toList()));

    // 역순 정렬
    System.out.println(practice2.sorted(Comparator.reverseOrder()));

    // 대소문자 구분 안함 정방향 정렬
    System.out.println(practice3.sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList()));

    // 대소문자 구분 안함 역방향 정렬
    System.out.println(practice4.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList()));

    // 길이순 정렬
    System.out.println(practice5.sorted(Comparator.comparing(String::length)).collect(Collectors.toList()));

    // 오토박싱X
    System.out.println(practice6.sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList()));

    // 길이순 정렬 (리버싱)
    System.out.println(practice7.sorted(Comparator.comparing(String::length).reversed()).collect(
        Collectors.toList()));
  }
}
