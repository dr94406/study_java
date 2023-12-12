package study.generic;

public class FruitGeneric {

  public static void main(String[] args) {

  FruitBoxa fruitboxa = new FruitBoxa<Fruit>();


  FruitBoxa fruitBoxa2 = new FruitBoxa<Apple>();

//  FruitBoxa fruitBoxa3 = new FruitBoxa<goodBaby>();
  }

  private static class Apple extends Fruit{
  }


  private static class Grape extends Fruit{
  }


  private static class goodBaby {
  }

}


class FruitBoxa<T extends Fruit> {

}

class Fruit{

}
