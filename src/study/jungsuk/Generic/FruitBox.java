package study.jungsuk.Generic;

import java.util.ArrayList;

public class FruitBox <T extends Eatable>{
    ArrayList<T> list = new ArrayList<>();

    FruitBox<Apple> appleBox = new FruitBox<>();
    FruitBox<Grape> grapeBox = new FruitBox<>();
}
