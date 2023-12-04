package study;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString

public class Member {

    private String name;
    private Integer age;

    private String color;


}
