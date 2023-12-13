package study.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMatch {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Eric", "Elena", "Java");

        boolean anyMatch = names.stream().anyMatch( name -> name.contains("E"));
        System.out.println(anyMatch);
    }
}
