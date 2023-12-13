package study.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinctPractice {
    public static void main(String[] args) {
        Member member = new Member("khm", 23, "BLUE");
        Member member1 = new Member("khm", 23, "BLUE");

        // 1.
        List<Member> memberList = Arrays.asList(member, member1);

        // 2.
        List<Member> memberLists = new ArrayList<>();
        memberLists.add(member);
        memberLists.add(member1);

        long good = memberList.stream().distinct().collect(Collectors.toList()).size();
        System.out.println(good);

    }
}
