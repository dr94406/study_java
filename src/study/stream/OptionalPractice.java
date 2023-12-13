package study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OptionalPractice {
    public static void main(String[] args) {


//        Optional<Member> optionalMember = Optional.of(new Member("khm",23,"RED"));
//        optionalMember.ifPresent( member -> optionalMember.stream().forEach(System.out::println));
//
//        optionalMember.ifPresentOrElse(member -> optionalMember.stream().
//                    forEach(System.out::println),
//                    () -> Optional.empty());
//
//        System.out.println("optionalMember.isEmpty() = " + optionalMember.isEmpty());
//
//
//
//        Optional<Member> optionalEmptyMember = Optional.empty();
//        if(optionalEmptyMember.isEmpty()){
//            Optional.of(new Member("eden", 23, "RED")).stream().forEach(System.out::println);
//        }
//
//        Optional<Member> optionalNotEmptyMember = Optional.of(new Member("khm",23,"BLUE"));
//        if(optionalNotEmptyMember.isPresent()) {
//            optionalNotEmptyMember.stream().forEach(System.out::println);
//        }
//
//        /** Optional에는 값이 들어있을 수도 있고 null도 있을 수 있다. **/
//        Optional<String> optionalEmptyCheck = Optional.ofNullable(null);
//        optionalEmptyCheck.orElse(("good"));

        List<String> good = Arrays.asList("khm","abc","dfd");

        List<Member> entity = Arrays.asList(new Member("khm",23,"BLUE"));
        System.out.println(entity.stream().filter(d -> good.contains(d.getName())).collect(Collectors.toList()));


    }
}
