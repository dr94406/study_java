package study.whiteship.thejava;

public class Foo {
    public static void main(String[] args) {
        RunEverything runEverything = new RunEverything() {
            int baseNumber = 10;

            @Override
            public int doIt(int number) {
                baseNumber++; // 외부의 값 변경
                return number + baseNumber;
            }
        };
    }
}
