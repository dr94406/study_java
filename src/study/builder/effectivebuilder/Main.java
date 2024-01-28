package study.builder.effectivebuilder;

public class Main {

    public static void main(String[] args) {

        Member member = new Member("good");

        Member2 member2 = new Member2();
        member2.setName("Lee");
        member2.setAge(20);

        Member3 member3 = new Member3.Builder("Lee").age(20).address("Korea").build();

        System.out.println(member3);
    }
}
