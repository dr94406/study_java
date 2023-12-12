package study.whiteship.extend;

public class Dragon implements EggLayer, FireBreather{

    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        System.out.println(dragon.identityMySelf());
    }
}
