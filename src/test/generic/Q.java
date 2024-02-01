package test.generic;

import java.util.ArrayList;
import java.util.List;

public class Q extends Q3 {
  public static void main(String[] args) {
    List<Q> qList = new ArrayList<>();
    qList.add(new Q());
    qList.add(new Q2());
    //    qList.add(new Q3()); 타입 불일치 (상속받지 않음)

    List<Q> qList2 = new ArrayList<>();
  }
}
