package study.ejava.extend;

public sealed class Person permits Employee, Manager{

	public String name;

	public void work() {
		System.out.println("하는일 결정 안됨");
	}
}
