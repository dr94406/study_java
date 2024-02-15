package study.ejava.str3am;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample2 {
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5 };

		Arrays.stream(intArray).boxed().forEach( obj -> {
			System.out.println(obj);
		});
	}
}
