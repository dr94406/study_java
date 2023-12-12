package study.generic;

class Juice {
  String name;

  Juice(String name) {
    this.name = name +"Juice";
  }
  public String toString(){
    return name;
  }

  class Juicer {
    static Juice makeJuice (FruitBox<? extends Fruit> box) {
      String tmp = "";

      for(Fruit f : box.getList())
    }
  }
}

public class FruitBoxEx3 {
  public static void main(String[] args) {

  }
}
