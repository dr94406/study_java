package study.stream.remind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringArrayToList {
    public static void main(String[] args) {
        String[] arrStringArray = {"khm","gobe","end","dockerbaby"};
        List<String> arrStringList = Arrays.asList(arrStringArray);


        // 스트링 배열을 리스트에 할당하기 방법 0
        List<String> arrStringList1 = new ArrayList<>();
        Arrays.stream(arrStringArray).forEach(s -> arrStringList1.add(s));

        List<String> arrStringList2 = new ArrayList<>();
        // 스트링 배열을 리스트에 할당하기 방법 1
        Arrays.stream(arrStringArray).forEach(s -> arrStringList2.add(s));
        System.out.println(arrStringList2);

//        // 스트링 배열을 리스트에 할당하기 방법 2
        for (String a : arrStringArray) {
            arrStringList2.add(a);
            System.out.println(arrStringList2);
        }

        // 스트링 배열을 리스트에 할당하기 방법 3
        for (int i = 0; i < arrStringArray.length; i++) {
            arrStringList2.add(arrStringArray[i]);
            System.out.println(arrStringList2);
        }

    }
}
