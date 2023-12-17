package test.wrapperclass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerComparator {

    @Test
    @DisplayName("Integer vs Integer.valueOf를 테스트")
    void test() {
        Integer testValue = 128;
        System.out.println(testValue.equals(Integer.valueOf(128)));
        System.out.println(testValue == Integer.valueOf(128));

    }
    @Test
    @DisplayName("원시형끼리 테스트")
    void compareInteger() {
        System.out.println(128 == 128);


    }

    @Test
    @DisplayName("숫자 비교 ")
    void IntegerCompare() {
        System.out.println(Integer.valueOf(128) == Integer.valueOf(128));
        System.out.println(Integer.valueOf(127) == Integer.valueOf(127));

    }
}
