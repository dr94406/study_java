package study.ejava.gerer1c;

public class GenericExample2 {
	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnonLight();

		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
	}
}
