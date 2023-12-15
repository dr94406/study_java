package study.basical.statical;

public class StaticMethod {
  private String name = "khm";
  private static String name2 = "khm";

  public static void printMax(int x, int y) {
    System.out.println(Math.max(x, y));
  }

  public static void printName() {
//    System.out.println(name1); 불가능.
    System.out.println(name2);
  }
}
