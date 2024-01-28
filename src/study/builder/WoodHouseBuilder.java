package study.builder;

public class WoodHouseBuilder extends Builder{
    @Override
    public void buildWalls() {
        house.setWalls("통나무");
    }

    @Override
    public void buildDoors() {
        house.setDoors("나무문");

    }

    @Override
    public void buildRoof() {
        house.setRoof("나무 천장");
    }

    @Override
    public void buildWindows() {
        house.setWindows("나무 창문");

    }

    @Override
    public House getHouse() {
        return house;
    }
}
