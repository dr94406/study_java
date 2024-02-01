package study.ejava.gerer1c;

public class GenericExample {
	public static void main(String[] args) {

		Product<Tv, String> product1 = new Product<>();

		product1.setKine(new Tv());
		product1.setModel("스마트 TV");

		Tv tv = product1.getKine();
		String tvModel = product1.getModel();

		Product<Car, String> product2 = new Product<>();
		product2.setKine(new Car());
		product2.setModel("SUV 자동차");

		Car car = product2.getKine();
		String carModel = product2.getModel();
	}
}
