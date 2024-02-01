package study.stream;



import java.util.List;
import java.util.stream.Collectors;

public class StreamAndVarLambda {
	public static void main(String[] args) {
		List<Integer> integerList = List.of(1, 2, 3, 4, 5);
		List<Integer> collect =
				integerList.stream().filter((var x) -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(collect);

	}
}
