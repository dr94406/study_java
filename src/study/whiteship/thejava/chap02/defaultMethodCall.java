package study.whiteship.thejava.chap02;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class defaultMethodCall {

  public static void main(String[] args) {


    List<String> names = new ArrayList<>();
    names.add("khm");
    names.add("lbh");
    names.add("kh");

    /** Iterable 인터페이스의 default 메소드 forEach **/
    names.forEach(System.out::println);


    Spliterator<String> spliterator1 = names.spliterator();

    /** spliterator = 쪼갤수 있는 iterator, 병렬 작업 시 사용 **/

    /** half slice **/
    Spliterator<String> spliterator2 = spliterator1.trySplit();

    while (spliterator1.tryAdvance(System.out::println));
    System.out.println("=======");
    while (spliterator2.tryAdvance(System.out::println));


    /** Collection 인터페이스의 default 메소드**/

    /** Stream/ parallelStream **/

    /** 반환 타입을 Set으로 **/
    System.out.println((names.stream().filter(s -> s.startsWith("k")).map(String::toUpperCase)
        .collect(Collectors.toSet())));
  }
}
