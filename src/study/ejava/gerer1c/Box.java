package study.ejava.gerer1c;

public class Box <T> {
	public T content; // type parameter


	public boolean compare(Box<T> other) {
		boolean result = content.equals(other.content);
		return result;
	}

}
