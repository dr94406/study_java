package study.basical.statical;

public class MyCalculator {

  public static String appName = "MyCaculator";

  public static int add(int x, int y){
    return x + y;
  }

  public  int min(int x, int y) {
    return x - y;
  }

  public static void main(String[] args) {
    System.out.println(MyCalculator.add(1, 2));
    MyCalculator myCalculator = new MyCalculator();
    System.out.println(myCalculator.min(1, 2));
  }
}
