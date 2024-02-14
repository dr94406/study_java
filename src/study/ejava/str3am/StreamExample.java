package study.ejava.str3am;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("신용권");
		set.add("남궁성");
		set.add("김영한");

		Stream<String> stream = set.stream();
		stream.forEach(name -> {
			System.out.println(name);
		});
	}
}
