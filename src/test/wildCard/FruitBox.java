package test.wildCard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class FruitBox<T>{

    @Test
    @DisplayName("박스로 상한 제한 ")
    void test() {
        FruitBox<Apple> fruitBox = new FruitBox<>();
        FruitBox<Grape> fruitBox2 = new FruitBox<>();
    }

    @Test
    @DisplayName("사과로 구현받은 구현체 ? ")
    void override() {
        Apple apple = new Apple();
        apple.good();
    }

    @Test
    @DisplayName("포도로 구현받은 구현체 ?")
    void override2() {
        Grape grape = new Grape();
        grape.good();
    }
}
