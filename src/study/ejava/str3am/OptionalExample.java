package study.ejava.str3am;


import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		OptionalDouble optionalDouble = list.stream().mapToInt(Integer::intValue).average();

		// 방법1
		if(optionalDouble.isPresent()) {
			System.out.println("방법1: " + optionalDouble.getAsDouble());
		}else {
			System.out.println("방법1_ 평균: 0.0");
		}

		//방법2
		double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("방법2_ 평균: 0.0" + avg);

		//방법3
		list.stream().mapToInt(Integer::intValue).average().ifPresent(a -> System.out.println("방법3_평균: " + a));

	}
}
