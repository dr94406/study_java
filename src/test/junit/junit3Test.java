package test.junit;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

import java.util.HashSet;
import java.util.Set;

public class junit3Test extends TestCase {

    public junit3Test() {
        System.out.println("jinit3Test created");
    }


    public void testAdd() {

        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(1, 2);

        //then
        Assertions.assertEquals(result, 3);

    }

    public void testSetOff() {

        Long id = 127L;

        Long parent_id = 127L;

        //given
        Set<Long> set = new HashSet<>();

        //when
        set.add(id);

        //then
        Assertions.assertTrue(set.contains(parent_id));
    }

    private class Calculator {

        int add(int a, int b) {
            return a + b;
        }
    }
}