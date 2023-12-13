package study.stream;

import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        Stream<String> StreamToMap = Stream.of("khm","khm2","khm3");
        /** 1번 -> String::toUpperCase 참조 **/
        StreamToMap.map(String::toUpperCase).forEach(System.out::println);

        /** 2번 -> 람다식 매개변수로 변환 **/
        StreamToMap.map(s -> s.toUpperCase()).forEach(System.out::println);

    }
}
