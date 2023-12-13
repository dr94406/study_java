package study.stream;


import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public interface reduce<T> {
    Optional<T> reduce(BinaryOperator<T> accumulator);
    OptionalInt reduced = IntStream.range(1, 4) // [1, 2, 3]
            .reduce((a, b) -> {
                return Integer.sum(a, b);
            });

    T reduce(T identity, BinaryOperator<T> accumulator);
    int reduces = IntStream.range(1, 4).reduce(10, (a, b) -> {
        return Integer.sum(a, b);
    });

}
