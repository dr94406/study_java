package study.basical.statical;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class CommonUtils {

  public static String getCurrentDate() {
    Date date = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd");
    return dateFormat.format(date);
  }

}
