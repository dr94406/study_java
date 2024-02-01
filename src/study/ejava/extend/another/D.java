package study.ejava.extend.another;

import study.ejava.extend.A;

public class D extends A {


	// 상속을 통해서는 가능
	public D() {
		super();
	}


	public void method1() {
		this.field = "value";

		this.method();
	}


	public void method2() {
//		A  = new A(); // 직접 객체 생성 후 사용은 불가
	}
}
