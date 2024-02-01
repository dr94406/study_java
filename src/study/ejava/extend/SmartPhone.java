package study.ejava.extend;

public class SmartPhone extends Phone {


	public boolean wifi;

public SmartPhone(String model, String color) {
	super(model, color);
	this.model = model;
	this.color = color;
	System.out.println("생성자 실행");
}

public void setWifi(boolean wifi) {
	this.wifi = wifi;
	System.out.println("와이파이 상태 변경");
}

	public void internet() {
		System.out.println("인터넷 연결");
	}
}
