package study.stream;

import java.util.Optional;

public class Outer {
    Nested nested;

    public static void main(String[] args) {

        // flatMap 적용 전
        Outer outer = new Outer();
        if (outer != null && outer.nested != null && outer.nested.inner != null) {
            System.out.println(outer.nested.inner.foo);
        }

        Optional.of(new Outer()).
                flatMap(o -> Optional.ofNullable(o.nested)).
                flatMap(n -> Optional.ofNullable(n.inner)).
                flatMap(i -> Optional.ofNullable(i.foo)).
                ifPresent(System.out::println);
    }
}
