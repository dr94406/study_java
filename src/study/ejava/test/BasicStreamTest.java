package study.ejava.test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BasicStreamTest {

	public static void main(String[] args) {


		String[] testvalue = {"hi", "반가반가"};

		var collect = Arrays.stream(testvalue).map(x -> x.toUpperCase()).collect(Collectors.joining());
		System.out.println(collect);

	}
}
