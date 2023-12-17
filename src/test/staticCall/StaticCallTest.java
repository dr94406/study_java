package test.staticCall;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StaticCallTest {

    public static String add(String a, String b) {
        return  a + b;
    }

    public String containswhether(String a, String b) {
        return a.contains(b) ? "포함되어 있으면 안돼 ! " : a + b;
    }

    public static String remove(String a, String b) {
        return a.contains(b) ? a : a + b;
    }

    @Test
    @DisplayName("static Variable Call")
    void staticalTest() {
        System.out.println(StaticCallTest.add("코드", "아기"));

        StaticCallTest staticCallTest = new StaticCallTest();
        System.out.println(staticCallTest.containswhether("코드아기", "드아"));

        System.out.println(StaticCallTest.remove("아기아기","어른어른"));
    }
}
