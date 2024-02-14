package study.ejava.lambda1;

public class LambdaExample2 {
	public static void main(String[] args) {
		Person2 person = new Person2();


		/** 매개 변수가 두 개일 경우 **/
		person.action1((name, job) -> {
			System.out.println(name + "입니다.");
			System.out.println(job + "입니다.");
		});
		person.action1((name, job) -> {
			System.out.println(name+ "이" + job +"배고프다.");
		});


		/** 매개 변수가 한 개일 경우 **/
		person.action2(content -> {
			System.out.println(content + "를 즐깁니다.");
		});
	}
}
