package study.basical.test;

 class Foo {

  private int value;

  public Foo(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}

public class Main {
  public static void main(String[] args) {
    Foo foo = new Foo(7);
    process(foo);
    System.out.println(foo.getValue());
  }


  public static void process(Foo foo) {

    foo.setValue(10);

    foo = new Foo(15);
  }
}
