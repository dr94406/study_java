package study.whiteship.extend;

public class Subclass extends Superclass{

    @Override
    public void printMethod() {
        super.printMethod(); // super 키워드로 멤버 메서드 접근
        System.out.println("Printed in Subclass.");
    }

    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printMethod();
    }

}
