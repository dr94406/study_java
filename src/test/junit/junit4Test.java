package test.junit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class junit4Test {

    public junit4Test() {
        System.out.println("call method");
    }
    @Test
    @DisplayName("Junit 4 test")
    public void Pare() {
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(3, 5);

        Assertions.assertEquals(result, -2);
    }

    private class Calculator {

        public int subtraction(int a, int b) {
            return a - b;
        }
    }
}