package study.whiteship.extend;

public interface EggLayer extends Animalo{
    default public String identityMySelf() {
        return "I am able to lay eggs.";
    }
}
