package study.whiteship.object;

public class Bicycle {

    public int cadence;
    public int gear;
    public int speed;

    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }


    public void setCadence(int newValue) {
        this.cadence = newValue;
    }

    public void setGear(int newValue) {
        this.gear = newValue;
    }

    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }
    public void setSpeed(int increment) {
        this.speed += speed;
    }
}
