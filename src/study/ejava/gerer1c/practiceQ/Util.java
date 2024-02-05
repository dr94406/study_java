package study.ejava.gerer1c.practiceQ;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Util <T, K> {

	private T t;
	private K k;

	public Integer getT(T t,  K k) {
		if(t.equals(k)) {
			return 111;
		}else {
			return null;
		}
	}
}
