package study.whiteship.interable;

public interface Movable {
    void move();

    default void stop() {
        System.out.println("Stop");
    }
}
