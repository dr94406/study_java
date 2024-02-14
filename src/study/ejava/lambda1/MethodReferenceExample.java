package study.ejava.lambda1;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person3 person3 = new Person3();
		person3.action(Computer::staticMethod);

		Computer computer = new Computer();
		person3.action(computer::instanceMethod);
	}
}
