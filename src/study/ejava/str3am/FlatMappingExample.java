package study.ejava.str3am;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("this is java");
		list.add("i am a best developer");
		list.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(word -> System.out.println(word));
		System.out.println();


		List<String> list2 = List.of("10", "20", "30", "40", "50");
		list2.stream().flatMapToInt(data -> {
			String[] strArr = data.split(", ");
			int[] intArr = new int[strArr.length];
			for(int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		}).forEach(number -> System.out.println(number));
	}
}
