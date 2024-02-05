package study.ejava.gerer1c;

public class GenericExample4 {
	public static <T> Box2<T> boxing(T t){
		Box2<T> box2 = new Box2<T>();
		box2.set(t);
		return box2;
	}

	public static void main(String[] args) {

		Box2<Integer> box1 = boxing(100);
		Integer intValue = box1.get();
		System.out.println(intValue);


		Box2<String> box2 = boxing("길동 홍");
		String strValue = box2.get();
		System.out.println(strValue);

	}
}
