package study.ejava.interf;

public class SmartTelevision implements RemoteControl, Searchable{
	@Override
	public void turnOn() {
		System.out.println("TV 키기");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 끄기");
	}

	@Override
	public void setVolume(int volume) {

	}

	@Override
	public void setMute(boolean mute) {
		RemoteControl.super.setMute(mute);
	}

	@Override
	public void search(String url) {
		System.out.println(url + "검색");
	}
}
