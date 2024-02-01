package study.ejava.interf;

import lombok.Getter;

@Getter
public class BasicClass implements BasicInterfa {

	@Override
	public void good() {
		System.out.println("기분 좋아");
	}

	@Override
	public void bad() {
		System.out.println("별로야");
	}
}
