package study.ejava.object;

public class CarExample {
	public static void main(String[] args) {


		Car mycar = new Car();
		System.out.println("mycar.model = " + mycar.model);
		System.out.println("mycar.compnay = " + mycar.compnay);
		System.out.println("mycar.color = " + mycar.color);
		System.out.println("mycar.speed = " + mycar.speed);
		System.out.println("mycar.maxSpeed = " + mycar.maxSpeed);

		mycar.speed = 500;
		System.out.println("mycar.speed = " + mycar.speed);

	}
}
