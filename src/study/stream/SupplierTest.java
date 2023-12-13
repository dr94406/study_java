package study.stream;

import study.interable.Supplier;

public class SupplierTest {

    public static void main(String[] args) {

    Supplier<String> supplier = () -> "Hello World!";

        System.out.println(supplier.get());
    }
}

