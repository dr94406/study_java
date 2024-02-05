package study.ejava.gerer1c.practiceQ;


public class ContainerExample {
	public static void main(String[] args) {
		Container<String> container = new Container<String>();
		container.setT("길동이");
		String str = container.getT();
		System.out.println(str);


		Container<Integer> container2 = new Container<Integer>();
		container2.setT(6);
		int value = container2.getT();
		System.out.println(value);
	}
}
