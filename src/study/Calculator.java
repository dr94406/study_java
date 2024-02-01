package study;

public class Calculator {



	public int _minus (int a, int b ) {
		return a - b;
	}

	public int _multiple(int a, int b ) {
		return a * b;
	}



	/** 정적 메소드 (스태틱은 객체를 생성하지 않아도 호출 가능 **/
	public static int multiple (int a, int b) {
		return a * b;
	}

	public static int minus (int a , int b) {
		return a - b;
	}

	public static int plus (int a, int b) {
		return a + b;
	}
}
