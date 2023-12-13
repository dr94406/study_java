package study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaguacyToLambda {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("abc","dcv","ghf");

//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));


    }
}
