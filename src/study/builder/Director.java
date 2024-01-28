package study.builder;


public class Director {
    private Builder builder;


    public Director(Builder builder) {
        this.builder = builder;
    }


    public void build() {
        builder.createHouse();
        builder.buildWalls();
        builder.buildWindows();
        builder.buildDoors();
        builder.buildRoof();
    }

    public House getHouse() {
        return builder.getHouse();
    }
}
