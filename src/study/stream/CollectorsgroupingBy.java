package study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsgroupingBy {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(new Product(23, "potato"),
                new Product(14, "orange"),
                new Product(13, "lemon"));

        Map<Integer, List<Product>> collectorMapOfLists = productList.stream().collect(Collectors.groupingBy(Product::getAge));
        System.out.println(collectorMapOfLists);

        Map<Boolean, List<Product>> mapPartitioned = productList.stream().collect(Collectors.partitioningBy(p -> p.getAge() < 15));
        System.out.println(mapPartitioned);
    }
}
