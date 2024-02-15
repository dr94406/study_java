package study.ejava.str3am;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("khm", 30));
		students.add(new Student("khm2", 55));
		students.stream().mapToInt(s -> s.getScore()).forEach(x -> {
			System.out.println(x);
		});
	}
}
