package study.builder.effectivebuilder;

public class Member {

    /** 점층적 생성자 패턴 **/
    private final String name;
    private final Integer age;

    public Member(String name) {
        this(name, null);
    }

    public Member(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
