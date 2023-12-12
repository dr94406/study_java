package study.whiteship.extend;

    public interface MyThical{
        default public String identityMySelf() {
            return "I am a mythical creature.";
        }
    }
