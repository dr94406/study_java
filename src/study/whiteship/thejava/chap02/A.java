package study.whiteship.thejava.chap02;

public interface A {

  /**
   * @implSpec
   * getName() [String] -> UpperCase
   */

  default void printNameUpperCase() {
    System.out.println(getName().toUpperCase());
  }

  // default string toString() {return ""; } -> Object Method 재정의 시 컴파일 X
  String toString(); // 선언 O 추상메서드 X

  void printName();

  String getName();
}
