package study;

public class CalculatorMain {

	public static void main(String[] args) {
		System.out.println("Calculator.minus(20, 10) = " + Calculator.minus(20, 10));
		System.out.println("Calculator.plus(10, 20) = " + Calculator.plus(10, 20));
		System.out.println("Calculator.multiple(2 , 5) = " + Calculator.multiple(2, 5));

		Calculator calculator = new Calculator();
		System.out.println("calculator._minus(20, 10) = " + calculator._minus(20, 10));
		System.out.println("calculator._multiple(2, 5) = " + calculator._multiple(2, 5));

		int result = calculator._minus(50, 30);
		System.out.println(result);

		int result2 = Calculator.minus(50, 30);
		System.out.println(result2);
	}
}
