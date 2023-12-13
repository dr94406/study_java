package study.stream;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
@EqualsAndHashCode

public class Member {

    private String name;
    private Integer age;

    private String color;


}
