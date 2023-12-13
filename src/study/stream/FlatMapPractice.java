package study.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapPractice {

    public static void main(String[] args) {

        // 2중 리스트
        List<List<String>> list= Arrays.asList(Arrays.asList("A"), (Arrays.asList("B")));
        List<String> flatMap = list.stream().flatMap(Collection::stream).collect(Collectors.toList());

        // 2차원 배열
        Stream<String[]> strStream = Stream.of(new String[] {"a","b","c"}, new String[] {"d","e","f"});

        // map 사용 시 2중 Stream 반환
        Stream<Stream<String>> stream = strStream.map(Arrays::stream);

        // flatMap 사용 -> 1중 Stream으로 하락
        Stream<String> streamFlat = strStream.flatMap(Arrays::stream);
    }
}

