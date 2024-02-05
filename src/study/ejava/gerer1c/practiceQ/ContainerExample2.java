package study.ejava.gerer1c.practiceQ;

public class ContainerExample2 {
	public static void main(String[] args) {
		Container2<String, String> container2 = new Container2<String, String>();
		container2.set("길 동 이 ", " 도 적 ");
		String name = container2.getKey();
		String job = container2.getValue();
		System.out.println(name + " , " + job);

		Container2<String, Integer> container3 = new Container2<String, Integer>();
		container3.set("길 동 나 이", 25);
		String name2 = container3.getValue();
		Integer age = container3.getKey();
		System.out.println(name2 + " , " + age);
	}


}
