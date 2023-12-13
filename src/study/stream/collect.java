package study.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class collect {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(new Product(23, "potato"),
                                                  new Product(14, "orange"),
                                                  new Product(13, "lemon"));

        /** Collectors.toList() **/
        List<String> nameList = productList.stream().map(Product::getName).collect(Collectors.toList());
        System.out.println(nameList);

        /** Collectors.joining() **/
        String listToString = productList.stream()
                .map(Product::getName)
                .collect(Collectors.joining());

        String listToString2 = productList.stream()
                .map(Product::getName)
                .collect(Collectors.joining(" "));

        String listToString3 = productList.stream().map(Product::getName).collect(Collectors.joining(", ", "<", ">"));
        System.out.println(listToString3);

        Double averageAmount = productList.stream().collect(Collectors.averagingInt(Product::getAge));

        System.out.println(averageAmount);

        Integer summingAmount = productList.stream().collect(Collectors.summingInt(Product::getAge));
        System.out.println(summingAmount);

        Integer summingAmount2 = productList.stream().mapToInt(Product::getAge).sum();
        System.out.println(summingAmount2);

        IntSummaryStatistics statistics = productList.stream().collect(Collectors.summarizingInt(Product::getAge));
        System.out.println(statistics);
     }
 }
