package study.basical.enumeration;

public class EasyEnumExample {

  public static final String PROCEEDING = "진행중";
  public static final String COMPLETE = "진행중";

  public static void main(String[] args) {
    String status1;

    status1 = EasyEnumExample.COMPLETE;
    status1 = EasyEnumExample.PROCEEDING;


    // PROCEEDING, COMPLETE를 제외한 다른 값을 할당하여도 컴파일 에러 X
    status1 = "준비중이!";

    Status status2;
    status2 = Status.COMPLETE;
    status2 = Status.PROCEEDING;

  }
}
