package test;

public class Unknown {
    public static void main(String[] args) {
        UnknownInterface unknownInterface = new UnknownInterface() {
            @Override
            public void test() {
                System.out.println("익명 클래스 던지기");
            }

        };
        unknownInterface.test();
    }
}
