package test.iterable;

public class Anonymous {
   Iterable iterable = new Iterable() {
    @Override
    public void call() {
      System.out.println("Anonymous Call");
    }
  };

   public void call2() {
     iterable.call();
   }
  public static void main(String[] args) {
    Anonymous anonymous = new Anonymous();
    anonymous.call2();
  }
  }
