package study.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            list.add(i);

        /** 모든 요소 출력 **/
        list.forEach(i -> System.out.printf(i +", "));
        System.out.println();

        /** 2의 배수 또는 3의 배수 **/
        list.removeIf(d -> d% 2 == 0 || d % 3 == 0);
        System.out.println(list);

        list.replaceAll(i -> i * 10);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");

        map.forEach(((k, v) -> System.out.println("{"+k+","+v+"},")));

    }
}
