package test;

import org.junit.jupiter.api.Test;
import study.override.Animal;

public class AnanymousObject {

    @Test
    void barkTest() {
        Animal anonymousObject = new Animal() {

            @Override
            public void bark() {
                System.out.println("bark");
            }
        };

        anonymousObject.bark();
        System.out.println(anonymousObject.getClass());
    }
}
