package study.ejava.gerer1c;

public class GenericExample3 {

	public static void main(String[] args) {
		Box box = new Box();
		box.content = "300";

		Box box2 = new Box();
		box2.content = "300";

		Box box3 = new Box();
		box3.content = 300L;

		boolean result1 = box.compare(box2);
		System.out.println(result1);

		boolean result2 = box.compare(box3);
		System.out.println(result2);

	}
}
