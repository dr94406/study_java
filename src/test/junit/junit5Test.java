package test.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class junit5Test {

    @Test
    @DisplayName("junit5")
    void addTest() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 55555);
        assertEquals(result, 55556);
    }

    private class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
    }
}