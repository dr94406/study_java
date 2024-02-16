package study.ejava.str3am;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		List<Student3> totalList = new ArrayList<>();
		totalList.add(new Student3("홍길동", "남", 66));
		totalList.add(new Student3("김감순", "여", 66));
		totalList.add(new Student3("최점순", "여", 96));
		totalList.add(new Student3("김땡칠", "남", 44));

		Map<String, List<Student3>> map =
				totalList.stream().collect(Collectors.groupingBy(t -> t.getSex()));

	List<Student3> maleList = map.get("남");
	maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();

		List<Student3> femaleList = map.get("여");
		femaleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();

		Map<String, Double> map2 = totalList.stream().collect(Collectors.groupingBy(s -> s.getSex(), Collectors.averagingDouble(s -> s.getAge())));
		System.out.println(map2);
	}
}
