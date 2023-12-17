package test.stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicStreamTest {

    @Test
    @DisplayName("스트림을 생성하는 방법")
    void createStream() {
        String[] strings = {"khm", "good", "body"};
        List<String> stringList = Arrays.asList(strings);

        /** 리스트를 스트림으로 변경 **/
        Stream<String> stringListToStream = stringList.stream();
        System.out.println(stringListToStream);

        /** 2, 배열을 스트림으로 변경 **/
        Stream<String> stringListToStream2 = Arrays.stream(strings);
        System.out.println(stringListToStream2);

        /** 3, 스트림에 값을 할당하여 바로 생성 **/
        Stream<String> stringStream = Stream.of("sia", "good", "coffee");

        /** 4, 빈 값으로 생성 **/
        Stream<String> stringstreamEmpty = Stream.empty();
    }

    @Test
    @DisplayName("스트림 필터 사용, 아닌 것 식별하기 사용")
    void createStreamFilterFalse() {
        Stream<String> CoffeeProductionArea = Stream.of("에티오피아", "케냐", "르완다", "파나마", "콜롬비아", "과테말라", "니카라과");
        CoffeeProductionArea.filter(s -> s.length() <= 5).dropWhile(s -> s.contains("에티오피아")).forEach(System.out::println);
    }

    @Test
    @DisplayName("스트림 필터 사용, 맞는 것 식별하기 사용")
    void createStreamFilterTrue() {
        Stream<String> CoffeeParmOwner = Stream.of("서필훈", "젠슨카이", "에이미");
        CoffeeParmOwner.filter(s -> s.endsWith("훈")).takeWhile(s -> s.startsWith("서")).forEach(System.out::println);
    }

    @Test
    @DisplayName("스트림 필터와 맵 사용")
    void createStreamMap() {
        Stream<String> StringStream = Stream.of("khm", "kho", "khw", "kha");
        /** 1번 **/
        StringStream.filter(s -> s.contains("kh")).filter(d -> d.endsWith("m")).map(String::toUpperCase).forEach(System.out::println);

        /** 2번 **/
        StringStream.filter(s -> s.contains("kh")).filter(d -> d.endsWith("m")).map(s -> s.toUpperCase()).forEach(System.out::println);
    }

    @Test
    @DisplayName("스트림 중복 제거 사용")
    void createStreamDistinct() {
        Stream<Integer> integerStream = Stream.of(123,123,123,123,213,123,123,312,321);
        integerStream.distinct().forEach(System.out::println);
    }

    @Test
    @DisplayName("스트림 문자열의 카운트 구하기")
    void createStringLengthCount() {
        Stream<String> createStringCount = Stream.of("khm","fo","sa");

        /** 요소 개수 **/
        System.out.println(createStringCount.count());

        /** 요소의 길이 **/
        System.out.println(createStringCount.mapToLong(s -> s.length()).sum());
    }

    @Test
    @DisplayName("스트림 맞는 것 구하기")
    void createAnyMatch() {
        Stream<Integer> createIntegerStream = Stream.of(1, 3, 5, 7, 9, 10);
        System.out.println(createIntegerStream.anyMatch(s -> s.longValue() >= 15));
    }

    @Test
    @DisplayName("스트림 전부 맞는 것 구하기")
    void createAllMatch() {
        Stream<String> createStringStream = Stream.of("khm", "kmh", "kbj" ,"kkk");
        System.out.println(createStringStream.allMatch(s -> s.startsWith("k")));
    }

    @Test
    @DisplayName("스트림 피크로 요소 실행 중 값 확인 해보기")
    void createStreamPeek() {
        Stream<String> createStingStreamPeek = Stream.of("aaaa","bbbbb","cccc","ffff","kkkk");
        System.out.println(createStingStreamPeek.filter(s -> s.length() <= 5).
                peek(s -> System.out.println("filtered value : " + s)).
                map(String::toUpperCase).
                collect(Collectors.toList()));
    }

    @Test
    @DisplayName("스트림 스킵으로 지정한 요소만큼 넘어가기")
    void createStreamSkip() {
        Stream<Integer> createIntegerStreamSkip = Stream.of(1, 5, 6, 9, 10);
        createIntegerStreamSkip.filter(s -> s % 2 == 0).skip(1).forEach(System.out::println);
    }

    @Test
    @DisplayName("스트림 최소값 구하기 ")
    void createStreamFindMinValue() {
        Stream<Integer> createIntegerStreamMinValue = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(createIntegerStreamMinValue.mapToLong(s -> s.intValue()).min());
    }

    @Test
    @DisplayName("스트림 최대값 구하기")
    void createStreamFindMaxValue() {
        Stream<Integer> createIntegerStreamMaxValue = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 30, 45, 100);
        System.out.println(createIntegerStreamMaxValue.mapToLong(d -> d.intValue()).max());
    }

    @Test
    @DisplayName("스트림 합계 구하기")
    void createStreamSum() {

        /** 1번 **/
        IntStream intStream = IntStream.of(1, 3, 5, 7, 9, 12, 15);
        System.out.println(intStream.sum());

        /** 2번 **/
        Stream<Integer> integerStreamList = Stream.of(1, 3, 5, 7, 9, 12, 15);
        System.out.println(integerStreamList.mapToLong(s -> s.longValue()).sum());
    }

    @Test
    @DisplayName("스트림 리듀싱 연산 해서 합계 구해보기")
    void createStreamReducing() {
        Integer[] numbers = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        int sum = Arrays.stream(numbers).reduce(0, Integer::sum);
        System.out.println(sum);
    }

    @Test
    @DisplayName("스트림 초기값 없는 리듀스")
    void createNotDefaultValueReduce() {
        Integer[] numbers = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        Optional<Integer> sum = Arrays.stream(numbers).reduce((a, b) -> (a + b));
        System.out.println(sum);
    }


    @Test
    @DisplayName("스트림 리듀스로 최소값 구해보기")
    void createStreamReduceMinValue() {
        Integer[] numbers = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        Optional<Integer> optionalIntegerMaxValue = Arrays.stream(numbers).reduce(Integer::min);
        System.out.println(optionalIntegerMaxValue);
    }

    @Test
    @DisplayName("스트림 리듀스로 최대값 구해보기")
    void createStreamReduceMaxValue() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Optional<Integer> optionalIntegerMaxValue = list.stream().reduce(Integer::max);
        System.out.println(optionalIntegerMaxValue);
    }

    @Test
    @DisplayName("스트림 리밋 사용해보기")
    void createStreamLimit() {
        List<Integer> integerList = List.of(1,3,5,7,8,9,10);
        System.out.println(integerList.stream().mapToLong(s -> s.intValue()).limit(5).sum());
    }
}
