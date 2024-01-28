package study.variable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TestVariable {
    String tableName;

    public static String Variable(String tableName) {
        if (!tableName.equals("board_")) {
            return tableName.replaceAll(tableName, "");
        }
        return tableName;
    }
}
