package study.ejava.str3am;

import java.util.Arrays;
import java.util.List;

public class AgreeExample {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5 };

		//카운팅
		long count = Arrays.stream(arr).filter(a -> a % 2 == 0).count();
		System.out.println("2의 배수 개수 : " + count);

		//총합
		int sum = Arrays.stream(arr).filter(n -> n % 2 == 0).sum();
		System.out.println("2의 배수 합 : " + sum);

		//평균
		double average = Arrays.stream(arr).filter(n -> n % 2 == 0).average().getAsDouble();
		System.out.println("2의 배수 평균 : " + average);

		//최대값
		int maxValue = Arrays.stream(arr).filter(n -> n % 2 == 0).max().getAsInt();
		System.out.println("최대값 :" + maxValue);

		//최소값
		int minValue = Arrays.stream(arr).filter(n -> n % 2 == 0).min().getAsInt();
		System.out.println("최소값: " + minValue);


		var firstValue = Arrays.stream(arr).filter(n -> n % 3 == 0).findFirst().getAsInt();
		System.out.println(firstValue);


	}
}
