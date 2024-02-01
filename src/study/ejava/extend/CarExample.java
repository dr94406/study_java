package study.ejava.extend;

public class CarExample {


	public static void main(String[] args) {
		CCar mycar = new CCar();

		mycar.tire = new Tire();

		mycar.run();

		mycar.tire = new HankookTire();
		mycar.run();

		mycar.tire = new KumhoTire();
		mycar.run();
	}
}
