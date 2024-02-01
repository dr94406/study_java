package study.ejava.interf;

public class Television implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("TV ON");
	}

	@Override
	public void turnOff() {
		System.out.println("TV OFF");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("VOLUME CONTROL");
	}
}
