package study.interable;

import java.util.Objects;
import java.util.function.Predicate;

public interface Iterable <T>{

    Predicate<Boolean> predicate = Objects::isNull;

    // isNull 함수
    public static boolean isNull(Object obj) {
        return obj == null;

    }

}
