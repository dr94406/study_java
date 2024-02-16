package study.ejava.str3am;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CreateIntValueList {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(50, "zzz", "DDD", 3000));
		productList.add(new Product(50, "zzz", "DDD", 3100));
		productList.add(new Product(50, "zzz", "DDD", 3200));
		productList.add(new Product(50, "zzz", "DDD", 3300));


		// 1. 그냥 데이터로 뽑기
		System.out.println(
				productList.stream().mapToInt(productValue -> productValue.getPrice()).sum());

		// 2. 리스트로 뽑기 (합 X)
		System.out.println(
				productList.stream().mapToInt(productPrice -> productPrice.getPrice()).boxed()
						.collect(Collectors.toList()));

		System.out.println(productList.stream().mapToInt(value -> value.getPrice()).sum());

	}
}
