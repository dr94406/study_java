package study.ejava.str3am;

import java.util.ArrayList;
import java.util.List;

public class SumPractice {

	public static void main(String[] args) {
		List<Student2> student2List = new ArrayList<>();
		student2List.add(new Student2("신용권이", 55));
		student2List.add(new Student2("남궁성이", 66));
		student2List.add(new Student2("최병우", 111));


		// 방법 1
		System.out.println(student2List.stream().mapToInt(Student2::getAge).sum());

		// 방법 2
		System.out.println(student2List.stream().map(Student2::getAge).reduce(0,(a,b) -> a + b));
	}
}
