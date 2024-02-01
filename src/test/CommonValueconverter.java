package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CommonValueconverter {


  @Test
  @DisplayName("단일 문자열 값 컨버팅")
  void StringConverter() {
    String convertValue = "GOOD_LIFE_BALANCE";
    var EnumDescription_ConvertValues = Arrays.stream(convertValue.split("_"))
        .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase()).collect(Collectors.joining()).replaceAll("(.)([A-Z])", "$1 $2");
    System.out.println(EnumDescription_ConvertValues);
  }


  @Test
  @DisplayName("문자열 배열 값 컨버팅")
  void StringArrayListConverter() {

    /**
     * String[] 내에 문자열 배열 값을 할당
     * input  : {"ATTACHMENT_SIZE_TOO_LARGE_ERROR", "ATTACHMENT_FILE_NOT_FOUND_ERROR"};
     * output :  Attachment Size Too Large Error, Attachment File Not Found Error
     */
    String[] converterListValue = {"ATTACHMENT_SIZE_TOO_LARGE_ERROR", "ATTACHMENT_FILE_NOT_FOUND_ERROR"};
    for (String s : converterListValue) {
      System.out.println(Arrays.stream(s.split("_"))
          .map(word2 -> word2.substring(0, 1).toUpperCase() + word2.substring(1).toLowerCase())
          .collect(Collectors.joining()).replaceAll("(.)([A-Z])", "$1 $2"));

    }
  }
}
