package study.builder.effectivebuilder;

public class Member3 {

    /** Builder Pattern **/

    private final String name;
    private final int age;
    private final String address;

    public static class Builder {
        private final String name;
        private int age = 0;
        private String address = "";

        public Builder(String name){
            this.name = name;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Member3 build() {
            return new Member3(this);
        }
    }

    private Member3(Builder builder) {
        name = builder.name;
        age = builder.age;
        address = builder.address;
    }

    @Override
    public String toString() {
       return "Member3 [name=" + name + ", age = " + age + " , address= " + address + "]";
    }
}
