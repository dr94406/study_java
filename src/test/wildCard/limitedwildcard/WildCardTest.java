package test.wildCard.limitedwildcard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Objects;

public class WildCardTest{

    @Test
    @DisplayName("상한 제한 테스트_ 자식")
    void wildcardTest(Collection<? extends goodAdult> a) {
//        for(Child c : a) {
//            System.out.println("컴파일 불가");
//        }
//        for(Teenager t : a) {
//            System.out.println("컴파일 불가");
//        }
        for(goodAdult g : a) {
            System.out.println("컴파일 가능");
        }
    }

    @Test
    @DisplayName("상한 제한 테스트_ 부모")
    void wildcardTest_2(Collection<? extends Adult> a) {
        for(goodAdult g : a) {
            System.out.println("컴파일 가능");
        }
    }

    @Test
    @DisplayName("상한 요소 삽입")
    void wildCardAddElement(Collection<? extends goodAdult> g) {
      /**  g.add(new Adult());
        g.add(new goodAdult());
        g.add(new Daddy()); **/
    }
}
