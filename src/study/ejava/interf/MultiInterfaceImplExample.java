package study.ejava.interf;

public class MultiInterfaceImplExample {
	public static void main(String[] args) {
		RemoteControl remoteControl = new SmartTelevision();
		remoteControl.turnOn();
		remoteControl.turnOff();

		Searchable searchable = new SmartTelevision();
		searchable.search("www.naver.com");
	}
}
