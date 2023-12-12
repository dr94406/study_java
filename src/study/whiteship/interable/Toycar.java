package study.whiteship.interable;

public class Toycar implements Car{
    @Override
    public boolean drive() {
        System.out.println("장난감 자동차 부릉 !");
        return true;
    }

    public void play() {
        if(this.drive()) {
            System.out.println("장난감 자동차 구동완료 ! ");
        }
    }

    public static void main(String[] args) {
        Car car = new Toycar();

        car.drive();
        ((Toycar) car).play();
    }
}
