package study.whiteship.thejava.chap03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {


  public static void main(String[] args) {
    List<OnlineClass> springClasses = new ArrayList<>();
    springClasses.add(new OnlineClass(1, "spring boot", true));
    springClasses.add(new OnlineClass(2, "spring data jpa", true));
    springClasses.add(new OnlineClass(3, "spring mvc", false));
    springClasses.add(new OnlineClass(4, "spring core", false));
    springClasses.add(new OnlineClass(5, "rest api development", false));

    List<OnlineClass> javaClasses = new ArrayList<>();
    javaClasses.add(new OnlineClass(6, "The Java, Test", true));
    javaClasses.add(new OnlineClass(7, "The Java, Code manipulation", true));
    javaClasses.add(new OnlineClass(8, "The Java, 8 to 11", false));


    List<List<OnlineClass>> hm = new ArrayList<>();
    hm.add(springClasses);
    hm.add(javaClasses);

    // 1. spring으로 시작하는 수업
    System.out.println(springClasses.stream().filter(s -> s.getTitle().startsWith("spring"))
        .map(OnlineClass::getTitle).collect(Collectors.toList()));
    // 2. close되지 않은 수업
    System.out.println(javaClasses.stream().filter(s -> !s.isClosed()).collect(Collectors.toList()));

    // 3. 수업 이름만 ㅗ아서 스트림 만들기
    System.out.println(javaClasses.stream().map(OnlineClass::getTitle).collect(Collectors.toList()));

    // 4. 두 수업 목록에 들어가 있는 모든 수업 아이디 출력
//    System.out.println(springClasses.stream().flatMap());

    // 5부터 10까지 1씩 증가하는 무한 스트림 중 앞 10개 뺴고 최대 10
//    Stream.iterate(10, i -> i + 1)
//        .skip(10)
//        .limit(10)
//        .forEach(System.out::println);


    // 자바 수업중에 Test가 들어있는 수업이 있는지 확인
    System.out.println(javaClasses.stream().map(OnlineClass::getTitle).anyMatch(s -> s.contains("Test")));

    // 스프링 수업 중에 제목 스프링 들어간것만 모아서 리스트 만들기
    System.out.println(springClasses.stream().filter(s -> s.getTitle().contains("spring"))
        .map(OnlineClass::getTitle).collect(Collectors.toList()));
  }
}
