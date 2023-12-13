package study.stream;

import java.util.List;

public class NullSafetyStream{
    public static void main(String[] args) {


        List<String> nullList = null;

        nullList.stream().filter(str -> str.contains("a")).map(String::length).forEach(System.out::println);

    }
}
