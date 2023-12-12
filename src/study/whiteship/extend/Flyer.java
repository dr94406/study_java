package study.whiteship.extend;
    public interface Flyer{
        default public String identityMyself() {
            return "I am able to fly.";
        }
    }
