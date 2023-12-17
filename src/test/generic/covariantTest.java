package test.generic;

import com.sun.security.jgss.GSSUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class covariantTest {

    @Test
    void genericTest() {
        Integer[] integers = new Integer[]{1,2,3};
        printArray(integers);
    }

    void printArray(Object[] arr) {
        for (Object e : arr) {
            System.out.println(e);
        }
    }

    @Test
    void genericTest2() {
        List<Integer> list = Arrays.asList(1, 2, 3);
//        printCollection(list); // 컴파일 불가
    }

    void printCollection(Collection<Object> c) {
        for(Object e : c) {
            System.out.println(e);
        }
    }

    @Test
    void genericTestByWildCard() {
        List<Integer> list = Arrays.asList(1, 3, 5);
        printWildCard(list);
    }

    void printWildCard(Collection<?> wildcard) {
        for (Object o : wildcard) {
            System.out.println(o);
        }
    }

    @Test
    void genericTestByWildCardList() {
        Collection<?> c = new ArrayList<String>();
//        c.add(new Object()); // 와일드카드는 Unknown Type이라 안 된다.
    }

    @Test
    void genericTestByObjectList() {
        Collection<Object> objects = new ArrayList<>(); // 타입 추론 기능으로 자동으로 생성
        objects.add(new Object());
    }
}
