package study.ejava.extend;

public class Car {

	public int speed;

	public void speedUp() {
		speed += 1;
	}


	public final void stop() {
		System.out.println("차 멈춤");
		speed = 0;
	}
}
