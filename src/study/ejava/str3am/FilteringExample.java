package study.ejava.str3am;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("남궁성");
		list.add("이선우");
		list.add("서민재");
		list.add("박채훈");
		list.add("남궁성");

		list.stream().distinct().forEach(s -> System.out.println(s));


		list.stream().filter(n -> n.startsWith("신")).forEach(n -> System.out.println(n));

		System.out.println();

		list.stream().distinct().filter(w -> w.startsWith("신")).forEach(n -> System.out.println(n));
		}
	}
