package study.ejava.interf;

public class AnimalCall {
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.call();

		Animal animal2 = new Dog();
		animal2.call();
	}
}
