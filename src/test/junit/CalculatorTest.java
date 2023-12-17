package test.junit;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest extends TestCase {

    public CalculatorTest() {
        System.out.println("CalculatorTest created! ");
    }

    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1,2 );
        Assertions.assertEquals(result, 3);
    }

    public void testAdd2() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1,2 );
        Assertions.assertEquals(result, 3);
    }

    public void testAdd3() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1,2 );
        Assertions.assertEquals(result, 3);
    }

    private class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
    }
}
