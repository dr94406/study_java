package study.ejava.str3am;

import java.util.List;

public class StreamPipeLineExample {

	public static void main(String[] args) {
		List<Student>  list = List.of(new Student("길 동 이 ", 10), new Student("궁 성 이 ", 20), new Student("용 궈 니 ", 30));

		var avg = list.stream().mapToInt(student -> student.getScore()).average().getAsDouble();
		System.out.println("평균 점수 : " + avg);
	}
}
