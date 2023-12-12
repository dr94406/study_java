package study.whiteship.extend.dynamicmethodDispatch;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal(); // Animal 참조,  Animal 객체
        Animal b = new Dog(); // Animal 참조, Dog 객체

        a.move(); // Animal class method call
        b.move(); // Dog class method call
    }
}
