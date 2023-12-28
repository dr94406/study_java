package study.jungsuk.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSortedTest {

  public static void main(String[] args) {

    Stream<Student> studentList = Stream.of(new Student("khm", 135, "boy"),
        new Student("1khm", 15, "boy"),
        new Student("k1h3m", 153, "boy")
    , new Student("k5h4m", 175, "boy"));

    studentList.sorted(Comparator.comparing(Student::getAge)).forEach(System.out::println);

  }
}
