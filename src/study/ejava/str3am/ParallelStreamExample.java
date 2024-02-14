package study.ejava.str3am;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample{

	public static void main(String[] args) {

		// 리스트 생성
		List<String> list = new ArrayList<>();
		list.add("김영한");
		list.add("남궁성");
		list.add("신용권");

		// 병렬 처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(name -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
		});
	}
}
