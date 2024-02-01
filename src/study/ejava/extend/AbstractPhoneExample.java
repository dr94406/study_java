package study.ejava.extend;

public class AbstractPhoneExample {
	public static void main(String[] args) {

		AbstractSmartPhone smartPhone = new AbstractSmartPhone("길동");

		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
