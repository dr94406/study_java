package study.ejava.object;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();


		if(obj1.equals(obj2)) {
			System.out.println("싱글톤 객체 비교 ");
		}



		if(obj1 == obj2) {
			System.out.println("같은 싱글톤 객체입니다.");

		}else {
			System.out.println("다른 싱글톤 객체입니다.");
		}
	}
}
