package study.regex;

import java.util.List;

public class pattern {

  public static void main(String[] args) {

    List<String> patternList = List.of("JPEG, GIF");

    List<String> photoList = List.of("photo.jpeg, phoao.gif");

    System.out.println(photoList.stream().filter(s -> s.split("\\.", 2).length > 1)
        .anyMatch(s -> patternList.contains(s.split("\\.", 2)[1].toUpperCase())));
  }
}
