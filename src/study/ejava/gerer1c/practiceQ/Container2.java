package study.ejava.gerer1c.practiceQ;



public class Container2<V, K> {
	private V value;
	private K key;

	public void set(V value, K key) {
		this.value = value;
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public K getKey() {
		return key;
	}
}
