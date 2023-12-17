package test.wildCard.limitedwildcard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;

public class wildcardLowerLimit {

    @Test
    @DisplayName("와일드카드 하한 테스트")
    void wildCardLowerTest(Collection<? super Child> c) {
        c.add(new miniBaby());
        c.add(new Baby());
        c.add(new Child());
      /** 상한 요소 제한
        c.add(new Student());
        c.add(new officeWorkers()); **/
    }

    private class miniBaby extends Baby {

    }
    private class Baby extends Child{
        void test() {
            System.out.println("Zzz");
        }
    }

    public class Child extends Student {
    }


    private class Student extends officeWorkers{
    }

    private class officeWorkers {
    }
}
