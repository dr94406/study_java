package test.generic;

import org.junit.jupiter.api.Test;

public class covariantTEst {

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
}
