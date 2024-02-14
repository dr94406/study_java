package study.ejava.lambda1;

import static java.lang.Double.sum;

public class LambdaExample3 {

	public static void main(String[] args) {
		Person3 person3 = new Person3();

		person3.action((x, y) -> {
			double result = x + y;
			return result;
		});

		person3.action((x, y) -> (x + y));

		person3.action((x, y) -> sum(x, y));
	}
}
