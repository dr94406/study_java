package study.ejava.gerer1c;

public class CarAgency implements Rentable<Car> {
	@Override
	public Car rent() {
		return new Car();
	}
}
