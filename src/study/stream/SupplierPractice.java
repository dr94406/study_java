package study.stream;

import java.util.function.Function;

public class SupplierPractice {
    public static void main(String[] args) {

        /** Supplier는 입력이 없고 출력만 가능 **/
//        Supplier<MyClass> s = () -> new MyClass();
//        Supplier<MyClass> s = MyClass::new;

//        MyClass mc = s.get();
//        System.out.println(mc);
//        System.out.println(s.get());
//
        Function<Integer, MyClass> s = (i) -> new MyClass(i);
//        Function<Integer, MyClass> f = MyClass::new;

        MyClass mc = s.apply(100);
        System.out.println(mc.iv);

        System.out.println(s.apply(200).iv);

//        Function<Integer, int[]> f = (i) -> new int[i];
          Function<Integer, int[]> f2 = int[]::new;
            int[] arr = f2.apply(100);
        System.out.println(f2.apply(100).length);
    }


    }
class MyClass {
    int iv;

    MyClass (int iv) {
        this.iv = iv;
    }
}
