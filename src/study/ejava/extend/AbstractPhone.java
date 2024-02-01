package study.ejava.extend;

public abstract class AbstractPhone {

	String owner;

	public AbstractPhone(String owner) {
		this.owner = owner;
	}

	void turnOn() {
		System.out.println("폰 전원 킴");
	}
	void turnOff() {
		System.out.println("폰 전원 끔");
	}
}
