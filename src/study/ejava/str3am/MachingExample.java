package study.ejava.str3am;

import java.util.List;

public class MachingExample {
	public static void main(String[] args) {
		List<Integer> integerList = List.of(2, 4, 6);
		System.out.println(integerList.stream().allMatch(s -> s % 2 == 0));

		System.out.println(integerList.stream().anyMatch(e -> e % 3 == 0));

		System.out.println(integerList.stream().noneMatch(q -> q % 3 == 0));
	}
}
