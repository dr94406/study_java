package study.whiteship.extend;

public class IntegerProducer extends Producer{

    @Override
    public Integer produce(String input) {
        return Integer.parseInt(input);
    }
}
