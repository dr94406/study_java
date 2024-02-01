package study.ejava.extend;


public class Phone {

	public String model;
	public String color;

	public void bell() {
		System.out.println("벨 울림");
	}

	public void sendVoice(String message) {
		System.out.println("자기: " + message);
	}

	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}

	public void hangUp() {
		System.out.println("전화 끊기");
	}

	public Phone() {
		System.out.println("Phone 생성자 실행");
	}

	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("매개변수 있는 생성자");
	}
}
