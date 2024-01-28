package study.builder;

public class ConcreateHouseBuilder extends Builder{
    @Override
    public void buildWalls() {
        house.setWalls("콘크리트");
    }

    @Override
    public void buildDoors() {
        house.setDoors("철제");
    }

    @Override
    public void buildRoof() {
        house.setRoof("빨간");
    }

    @Override
    public void buildWindows() {
        house.setWindows("일반");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
