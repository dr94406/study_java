package study.generic;

public class GenericPractice2 {

  public static void main(String[] args) {

    FruitBox<Apple> boxList = new FruitBox<Apple>();


/** FruitBox의 자손이 아니기에 예외 발생    FruitBox<Box> box = new FruitBox<Box>(); **/

  }

  private static class Apple extends Fruit{

  }

  private static class Grape extends Fruit{

  }

  private static class Box {

  }

  private static class FruitBox<T extends Fruit> {

  }

  private static class Fruit{

  }
}
