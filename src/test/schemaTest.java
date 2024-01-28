package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import study.variable.TestVariable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class schemaTest {
    @Test
    @DisplayName("schemaTest")
    public void test(){
        String test = "board_post charset "+"board_folder charset"+" approval charset";
        String approval = test.replaceAll("approval", "");
        List<String> aa = List.of(approval);
//        System.out.println(approval);
        String board_ = TestVariable.Variable("board_");
        System.out.println(board_);
        }
}
