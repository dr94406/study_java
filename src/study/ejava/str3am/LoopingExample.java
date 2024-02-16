package study.ejava.str3am;

import java.awt.print.Printable;
import java.util.Arrays;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		Arrays.stream(intArr).filter(a -> a % 2 ==0).peek(n -> System.out.println(n));

		int total = Arrays.stream(intArr).filter(x -> x % 2 == 0).peek(z -> System.out.println(z)).sum();

		System.out.println("총합: " + total);

		Arrays.stream(intArr).filter(a -> a % 2 == 0).forEach(y -> System.out.println(y));
	}
}
