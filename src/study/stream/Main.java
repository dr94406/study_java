package study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(80, 95, 72),
                new Student(50, 95, 72));

        students.stream().flatMapToInt(student ->
                IntStream.of(student.getKor(), student.getEng(), student.getMath()))
                .average()
                .ifPresent(avg -> System.out.println(Math.round(avg * 10) / 10.0));
    }
}
