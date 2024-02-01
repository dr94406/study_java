package study.whiteship.thejava.chap02;

public class DefaultA implements A, C{

  String name;

  public DefaultA(String name) {
    this.name = name;
  }

  @Override
  public void printName() {
    System.out.println(getName());

  }

  @Override
  public String getName() {
    return this.getName();
  }


  public static void main(String[] args) {
    A a = new DefaultA("khm");
    a.printNameUpperCase();
  }
}
