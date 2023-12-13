package study.stream;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class Product {

    private Integer age;
    private String name;
}
