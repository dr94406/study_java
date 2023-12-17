package test.wildCard.limitedwildcard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;

public class wildcardUpperLimit{

    @Test
    @DisplayName("와일드카드의 상한제한 테스트")
    void wildcardUpperLimit(Collection<? extends Parent> p) {
    /** for(newbornBaby b : p) {

        }
        for(Baby bb : p) {

        }

        for(Child c : p) {

        }
    **/
        for(Parent pa : p){

        }

        for (ParentsParents pp : p) {

        }
    }

    private class Parent extends ParentsParents{
    }

    private class ParentsParents {
    }

    private class Child extends Parent {
    }

    private class Baby extends Child {
    }

    private class newbornBaby extends Baby {
    }

}
