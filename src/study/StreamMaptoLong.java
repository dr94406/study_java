package study;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMaptoLong {
    public static void main(String[] args) {

        List<Member> strList = List.of(new Member("khm", 24, "BLUE"),(new Member("lja",25,"pink")));

        /** [25] **/
        System.out.println(strList.stream().filter(s -> s.getName().startsWith("l")).mapToLong(c -> c.getAge()).boxed().collect(Collectors.toList()));
    }
}
