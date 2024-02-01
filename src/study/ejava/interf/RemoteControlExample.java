package study.ejava.interf;

public class RemoteControlExample {
	public static void main(String[] args) {

		RemoteControl remoteControl;

		remoteControl = new Television();
		remoteControl.turnOn();
		remoteControl.setVolume(5);
		remoteControl.turnOff();

		remoteControl.setMute(true);
		remoteControl.setMute(false);


		System.out.println();

		remoteControl = new Audio();
		remoteControl.turnOn();
		remoteControl.setVolume(30);

		remoteControl.setMute(true);
		remoteControl.setMute(false);

		System.out.println();

		RemoteControl.changeBattery();
	}
}
