package study.stream.remind;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Beforeandafterstream {
    public static void main(String[] args) {
        String[] nameArr = {"IronMan", "Captain", "Hulk", "Thor"};
        List<String> nameList = Arrays.asList(nameArr);

        Arrays.sort(nameArr);
        Collections.sort(nameList);

        for (String str : nameArr) {
            System.out.println("nameArr"+str);
        }

        for (String str : nameList) {
            System.out.println("nameList"+str);
        }

        /** 처음부터 스트림으로 생성 **/
        Stream<String> nameListToStream = Stream.of("IronMan", "Captain", "Hulk", "Thor");
        nameListToStream.sorted().forEach(System.out::println);

        /** 리스트 만든 후 스트림으로 생성 **/
        String[] strList = {"IronMan","Captain","Hulk","Thor"};
        List<String> nameList2 = Arrays.asList(strList);

        /** 방법 1 **/
        Stream<String> nameListStream = nameList2.stream();
        Stream<String> strListArray = Arrays.stream(strList);

        nameListStream.sorted().forEach(System.out::println);
        strListArray.sorted().forEach(System.out::println);

    }
}
