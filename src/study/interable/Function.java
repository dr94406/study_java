package study.interable;

import java.util.Objects;

@FunctionalInterface
public interface Function <T,R>{

    R apply(T t);

//    default<V> Function<V, R> compose(Function<? super V, ? extends  T> before) {
//    }
}
