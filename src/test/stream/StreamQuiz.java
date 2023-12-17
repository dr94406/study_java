package test.stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamQuiz {

    /**
     * 간단한 스트림 퀴즈, 합계를 내는 방법 2개 이상 구해보기
     * 뭘 하든 방식은 자유
     */

    @Test
    @DisplayName("1번, 스트림에서 바로 of로 만들어 변환")
    void StreamQuiz() {
        Stream<Integer> stream = Stream.of(1, 3, 5, 9, 12, 15, 16, 20 ,30);
        /** 메서드 참조 **/
        System.out.println(stream.mapToLong(Integer::longValue).sum());
    }

    @Test
    @DisplayName("2번, IntStream 사용")
    void StreamQuiz2() {
        IntStream intStream = IntStream.of(1, 3, 5, 9, 12, 15, 16, 20, 30);
        System.out.println(intStream.sum());
    }

    @Test
    @DisplayName("3번 LongStream!")
    void StreamQuiz3() {
        LongStream longStream = LongStream.of(1, 3, 5, 9, 12, 15, 16, 20, 30);
        System.out.println(longStream.sum());
    }

    @Test
    @DisplayName("4번 ! Reduce 사용 ")
    void StreamQuiz4() {
        Stream<Integer> stream = Stream.of(1, 3, 5, 9, 12, 15, 16, 20, 30);
        System.out.println(stream.reduce(0, Integer::sum));
    }
}
