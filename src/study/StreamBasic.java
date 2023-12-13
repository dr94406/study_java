package study;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamBasic {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> listStream = list.stream();
        System.out.println(listStream.filter(s -> s.contains("b")).map(String::toUpperCase).collect(Collectors.toList()));



        /** 스트림 만드는 방법 2가지 **/
        Stream<String> listaddStreamList = Stream.of("z", "x", "c");
        Stream<String> listaddArrayStream = Arrays.stream(new String[]{"z", "x", "c"});



        List<String> testNameList = Arrays.asList("khm","김형민312321312","바보");

        Stream<String>  dd = testNameList.stream();
        System.out.println(dd.filter(name -> name.contains("김형민")).collect(Collectors.toList()));

        Stream<String> upperTest = testNameList.stream();
        System.out.println(upperTest.filter(d -> d.contains("khm")).map(String::toUpperCase).collect(Collectors.toList()));
    }
}
