package test;

public class test {

  public static void main(String[] args) {
    int x = 10;
    int[] y = {2, 3, 4};
    Dog dog1 = new Dog("강아지 1");
    Dog dog2 = new Dog("강아지 1");

    foo(x, y, dog1, dog2);
    System.out.println("x" + x);
    System.out.println("y" + y[0]);
    System.out.println("dog1" + dog1.getName());
    System.out.println("dog2" + dog2.getName());
  }


    public static void foo(int x, int[] y, Dog dog1, Dog dog2) {
      x++;
      y[0] ++;
      dog1 = new Dog("이름 바꾼 갱지!");
      dog2.setName("바꿀거야 갱지");
    }
  }
