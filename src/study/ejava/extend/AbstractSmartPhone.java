package study.ejava.extend;

public class AbstractSmartPhone extends AbstractPhone {

	public AbstractSmartPhone(String owner) {
		super(owner);
	}

	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
