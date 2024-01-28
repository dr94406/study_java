package study.khm.chap1;

public class variable_rowtype {

    /** 기본형 로 타입 변수 **/

    float floatValue = 150.0F; // 정교한 소수점 작업이 필요 할 시 사용한다.
    double doubleValue = 150.0; // double은 float의 상위 요소
    byte byteValue = 100; // 파일 읽어오거나 할 때 주로 사용한다.
    int intValue = 100; // 가장 많이 사용하는 수를 계산하는 변수
    long longValue = 100; // int를 초과하는 범위에서 사용하자.
    char charValue = 'K'; // 1글자만 쓰이고 4 바이트의 저장공간이 있다.
    String strValue = "khm"; // 실행 시점에 쓰일 공간이 결정된다. 여러 글자를 담을 수 있다.
    boolean booleanValue = false; // 참, 거짓 여부를 결정하는 것에 사용한다. 가능하면 래퍼클래스를 사용하는 것이 좋은 예이다.

    /** ex) boolean으로 get을 만들어 보면 된다, 이렇게 되면 인식이 안 되는 경우가 종종 있다. **/
    public boolean isBooleanValue() {
        return booleanValue;
    }
}
