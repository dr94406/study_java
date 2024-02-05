package study.ejava.gerer1c;

public class Practice {

	private static <T extends Exception> String exception(T b1) {
		return b1.getMessage();

	}

	public static void main(String[] args) {
		System.out.println(exception(new CookieException("zzzz")));
	}
}
