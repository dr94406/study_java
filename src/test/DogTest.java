package test;

import org.junit.jupiter.api.Test;
import study.override.Animal;
import study.override.Dog;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void animalBark() {
        Animal animal = returnDog();
        animal.bark();
    }

    private Dog returnDog() {
        return new Dog();
    }

}