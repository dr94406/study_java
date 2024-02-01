package study.ejava.object;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Car {


	String compnay = "현대";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;


	public Car(String compnay, String model, String color, int maxSpeed, int speed) {
		this.compnay = compnay;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
}
