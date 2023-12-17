package test.wildCard.limitedwildcard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;

public class lowerboundwildcard {

    @Test
    @DisplayName("하한 경계 와일드카드")
    void LowerBoundCard(Collection<? super Adult> g){
        g.add(new Adult());
        g.add(new Child());
        g.add(new Teenager());

        /**g.add(new Daddy());
        g.add(new goodAdult()); **/

    }
}
