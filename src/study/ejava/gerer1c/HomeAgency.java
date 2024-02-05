package study.ejava.gerer1c;

public class HomeAgency implements Rentable<Home>{
	@Override
	public Home rent() {
		return new Home();
	}
}
