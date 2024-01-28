package study.builder;

public class Main {

    public static void main(String[] args) {
        Builder concreateHouseBuilder = new ConcreateHouseBuilder();
        Director director = new Director(concreateHouseBuilder);
        director.build();

        House house = director.getHouse();
        System.out.println(house);

        Builder woodHouseBuilder = new WoodHouseBuilder();
        director = new Director(woodHouseBuilder);
        director.build();

        House house2 = director.getHouse();
        System.out.println(house2);

    }
}
