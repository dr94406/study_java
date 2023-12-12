package study.generic;

import java.util.ArrayList;

public class FruitBox{
  public static void main(String[] args) {
}
  class GoodBox<T extends Fruit> {
    ArrayList<T> list = new ArrayList<T>();
  }

private static class Fruit {

}

private static class Toy {

}

  private static class Apple extends Fruit{
  }


  private static class Grape extends Fruit{
  }


}
class Box<T> {
  ArrayList<T> list = new ArrayList<T>();
  void add(T item) {
    list.add(item);
  }
  T get (int i) {
    return list.get(i);
  }

  int size(){
    return list.size();
  }

  public String toString(){
    return list.toString();
  }
}

