package study.builder;

public abstract class Builder {

    protected House house;

    public void createHouse() {
        house = new House();
    }


    public abstract void buildWalls();

    public abstract void buildDoors();

    public abstract void buildRoof();

    public abstract void buildWindows();

    public abstract House getHouse();
}
