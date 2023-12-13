package study.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LikesCount {

  public static void main(String[] args) {
     Integer Likes;
     Boolean checked;
     List<Boolean> LikedUser = List.of(true, false, true, false);
    IntStream intStream = LikedUser.stream().mapToInt(s -> s ? 1 : 0);
    System.out.println(intStream.sum());
  }
}
