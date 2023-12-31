package study.whiteship.thejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTestApp {

    public static void main(String[] args) {

        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "springBoot", true));
        springClasses.add(new OnlineClass(2, "springData optional", true));

        Optional<OnlineClass> optional = springClasses.stream().filter(o -> o.getTitle()
                .startsWith("optional"))
                .findFirst();

        boolean present = optional.isPresent();
        boolean empty = optional.isEmpty();
        System.out.println(present);
        System.out.println(empty);

        // 값이 있는 경우만 함수 동작
        optional.ifPresent(oc -> System.out.println(oc.getTitle()));

        // 값이 없는 경우 리턴할 객체 넣어줌
        OnlineClass onlineClass = optional.orElse(createNewClass());
        System.out.println(onlineClass.getTitle());

        // 값이 없는 경우만 수행
        OnlineClass onlineClass1 = optional.orElseGet(OptionalTestApp::createNewClass);
        System.out.println(onlineClass1.getTitle());

        // orElseThrow(Supplier)
        OnlineClass onlineClass2 = optional.orElseThrow(() -> {
            return new IllegalArgumentException();
        });

        // method reference
        OnlineClass onlineClass3 = optional.orElseThrow(IllegalArgumentException::new);

        //Optional Filter -> 옵셔널 타입이 리턴
        Optional<OnlineClass> onlineClass4 = optional.filter(oc -> oc.getNumber() > 10);

        // OptionalMap = map으로 변환한 타입을 Optional으로 감싸 리턴
        Optional<Integer> integer = optional.map(OnlineClass::getNumber);

    }

    private static OnlineClass createNewClass() {
        return new OnlineClass();
    }
}
