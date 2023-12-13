package study.stream;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        TestValue testValue = new TestValue();
        Map<String, Long> map = new HashMap<>();

        System.out.println(map.put("parent_id", testValue.getParent_id()));
    }
}
