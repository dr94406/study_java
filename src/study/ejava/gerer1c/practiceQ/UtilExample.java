package study.ejava.gerer1c.practiceQ;



import java.awt.print.PrinterGraphics;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길우", 25);
		Util util = new Util();

		Integer age = util.getT(pair.getKey(), "홍길우");
		System.out.println(age);
	}
}
