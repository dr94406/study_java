package study.ejava.interf;

public class ExtendsExample {
	public static void main(String[] args) {
		InterfaceImpl impl = new InterfaceImpl();

		InterfaceA interfaceA = impl;
		interfaceA.methodA();
		System.out.println();

		InterfaceB interfaceB = impl;
		interfaceB.methodB();
		System.out.println();

		InterfaceC interfaceC = impl;
		interfaceC.methodA();
		interfaceC.methodB();
		interfaceC.methodC();
	}
}
