package study.ejava.str3am;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 30));
		studentList.add(new Student("신용권", 50));
		studentList.add(new Student("양귀자", 10));

		// js 스타일 ? ㅋㅋ
		studentList.stream().sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore())).forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));

		studentList.stream().sorted((s1 , s2) -> Integer.compare(s2.getScore(), s1.getScore())).forEach(x -> System.out.println(x.getName() + " : " + x.getScore()));
	}
}
