package study.whiteship.extend;

public interface Animalo {
    default public String identityMySelf() {
        return "I am an animal.";
    }
}
