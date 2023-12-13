package study.stream;

import java.util.stream.Stream;

public class StreamStartedSequence {
    public static void main(String[] args) {
//        Stream.of("a","b","c","d","e").filter(s -> {
//            System.out.println("filter: " + s);
//            return true;
//        }).forEach(s -> System.out.println("forEach: " +s));
//
//
//        Stream.of("a","b","c","d")
//                .map(s -> {
//                    System.out.println("map: " + s);
//                    return s.toUpperCase();
//                })
//                .anyMatch(s -> {
//                    System.out.println("anyMatch: " + s);
//                    return s.startsWith("A");
//                });


//        Stream.of("a","b","c")
//                .map(s -> {
//                    System.out.println("map: " +s);
//                    return s.toUpperCase();
//                })
//                .filter(s -> {
//                    System.out.println("filter: "+ s);
//                    return s.startsWith("A");
//                })
//                .forEach(s -> System.out.println("forEach: " + s));

        Stream.of("a","b","c","d")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }
}
