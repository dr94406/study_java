package test.rowType;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class rowTypeTest {

    @Test
    @DisplayName("기본형 타입 검사하기")
    void test() {
        char g1 = 'K';
        System.out.println(g1);
    }

    @Test
    @DisplayName("기본형 타입 검사하기 투 ")
    void test2() {
        String g1 = "K";
        System.out.println(g1);
    }
}
