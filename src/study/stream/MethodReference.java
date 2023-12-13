package study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReference {
    public static void main(String[] args) {
        Function<String, Integer> function = (str -> str.length());
        function.apply("Hello World!");

        Function<String, Integer> functions = String::length;
        functions.apply("Hello World!!!!");

        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello good!!!");

        List<String> list = Arrays.asList("red", "orange", "yellow", "green", "blue");
        list.forEach(System.out::println);

        Predicate<Boolean> predicate = Objects::isNull;

        Supplier<String> supplier = String::new;

        Function<String, Integer> f = Integer::parseInt;
        System.out.println(f.apply("100")+ 200);

        Function<String, Integer> f2 = Integer::parseInt;

    }
}
