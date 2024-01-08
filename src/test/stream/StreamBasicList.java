package test.stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasicList {

    @Test
    @DisplayName("리스트 안에 리스트 넣고 플랫맵")
    void list(){
    List<String> arrList = new ArrayList<>();
    arrList.add("good");
    List<String> arrList2 = new ArrayList<>();
    arrList2.add("boy");
    List<String> arrList3 = new ArrayList<>();
    arrList3.add("haha");

    Stream<String> stream = Stream.of(arrList, arrList2, arrList3).flatMap(list -> list.stream());
        System.out.println(stream.collect(Collectors.toList()));
    }
}
