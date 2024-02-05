package study.ejava.gerer1c;

public class FruitCall {
	public static void main(String[] args) {
		FruitBox<String, Integer> fruitBox = new FruitBox<>();
		fruitBox.setFruitColor("노란색");
		fruitBox.setFruitPrice(20000);
		System.out.println(fruitBox.getFruitColor());
		System.out.println(fruitBox.getFruitPrice());
	}
	}
