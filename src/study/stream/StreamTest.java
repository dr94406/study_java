package study.stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {


    public static void main(String[] args) {
//        List<Member> list = new ArrayList<>();
//        list.add(new Member("김형민",23, "RED"));
//        list.add(new Member("강찬식",24, "BLUE"));
//        list.add(new Member("이상호", 28, "BLACK"));
//        list.add(new Member("최말자", 29, "WHITE"));
//        list.add(new Member("ggg", 43, "PINK"));
//
//        List<Member> test = list.stream().
//                filter( s -> s.getAge() > 25).
//                filter(s -> s.getName().startsWith("g"))
//                .collect(Collectors.toList());

//        test.forEach(System.out::println);

//        IntStream intStream = IntStream.range(1, list.get(0).getAge());
//        intStream.forEach(System.out::println);

//        Stream<Object> stream = test.stream().map(s -> s.getName().toUpperCase());
//
//        stream.forEach(System.out::println);


//        Stream<Integer> lists = Arrays.asList(1,2,3,4,5).stream().filter(s -> s % 2 == 0);
//        lists.forEach(System.out::println);
//
//
//
//
//
//        IntStream intStream = IntStream.range(1, 5).filter(a -> a % 2 == 0);
//        intStream.forEach(System.out::println);
//
//
//        String[] testa = {"khm", "khm3", "khm4", "khm5"};
//        List<String> strList = Arrays.asList(testa);
//
//        // 1.
//        strList.stream().sorted().filter(s -> s.contains("3")).collect(Collectors.toList()).forEach(System.out::println);
//
//        // 2.
//        Stream<String> strgood = Arrays.stream(testa);
//        strgood.sorted().filter(a -> a.endsWith("3")).collect(Collectors.toList()).forEach(System.out::println);
//



//        Stream<String> str = strList.stream();
//        Stream<String> str2 = Arrays.stream(testa);
//
//        strList.forEach(System.out::println);


        /** Stream을 하나 만들고 조건에 맞는 사람을 찾아라
         * 조건 : 나이가 23세이며 퍼스널 컬러가 RED이며 이름 끝이 "민"으로 끝나야 한다.
         *
         * **/

        // 1.
//        List<Member> lisa = list.stream().filter(s -> s.getName().endsWith("민")).filter(s -> s.getAge() == 23).filter(s -> s.getColor() == "RED").collect(Collectors.toList());
//
//        lisa.forEach(System.out::println);
//
//
//
//        List<String> streamTest = Arrays.asList("a1", "b2", "c3", "a4", "b5", "a0", "a7");
//
//
//
//         Long gg = streamTest.stream().filter(s -> s.startsWith("a")).map(String::toUpperCase).sorted().count();
//
//         Boolean tt = streamTest.stream().filter(s -> s.startsWith("a")).map(String::toUpperCase).anyMatch(s -> s.length() < 5);
//
//        System.out.println(tt);
//
//        System.out.println("gg = " + gg);
//
//
//        List<String> strTest = streamTest.stream().filter(s -> s.startsWith("a")).map(String::toUpperCase).collect(Collectors.toList());
//
//        strTest.forEach(System.out::println);
//

//
//        Integer[] ogod = new Integer[]{10,9,5,1,2,3};
//        System.out.println("ogod.length = " + ogod.length);
//
//        List<Integer> od = Arrays.asList(ogod);
//
//        od.stream().sorted();
//
//        od.forEach(System.out::println);
//
//
//        String[] nameList = {"dhm", "khm", "lhm", "phm", "eee"};
//        List<String> nameStringList = Arrays.asList(nameList);
//
//        // 1
//        Stream<String> str1 = nameStringList.stream();
//
//        // 2
//        Stream<String> str2 = Arrays.stream(nameList);
//
//        str1.sorted().filter(s -> s.endsWith("m")).map(String::toUpperCase).forEach(System.out::println);
//
//        str2.sorted().filter(s -> s.endsWith("e")).map(String::toUpperCase).forEach(System.out::println);
//
//
//        String[] strArr = {"khmtest", "khm", "oddd"};
//
//        List<String> strListArr = Arrays.asList(strArr);
//
//        Stream<String> strStream = strListArr.stream();
//
//        List<String> good = new ArrayList<>();
//        strStream.filter(s -> s.length() > 3).map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
//

//        System.out.println("test " + good.addAll(strStream.filter(s -> s.length() > 3).map(String::toUpperCase).collect(Collectors.toList())));
//
//        System.out.println(good.toString());


//        /** 1. 사전순으로 정렬하시오
//         *  2. 3글자 이하인 것만 반환하시오
//         *  3. 끝나는 문자가 f인 것을 반환하시오.
//         */
//
//        String[] good = {"khm", "oddd", "aaa", "bbb", "af"};
//
//        List<String> goodList = Arrays.asList(good);
//
//        Stream<String> a = goodList.stream();
//
//        a.sorted().filter(s -> s.length() < 3).filter(s -> s.endsWith("f")).forEach(System.out::println);


        /** 1. 기존 형태로 만듭니다.
         *  2. 기존 형태에서 스트림으로 변환시킵니다.
         * 3. 확인합니다.
        **/


////       1.
//        List<String> str1 = new ArrayList<>(Arrays.asList("khm","oddd","biz"));
//        List<String> str2 = new ArrayList<>(Arrays.asList("jys","oddd","biz"));
//        List<String> str3 = new ArrayList<>(Arrays.asList("ljh", "oddd","biz"));
//
//        List<String> strList = new ArrayList<>();
//
//        strList.add(str1.toString());
//        strList.add(str2.toString());
//        strList.add(str3.toString());
//
//        System.out.println(strList.toString());
//
////       2.
//
//        List<String> good = Stream.of(str1.toString(), str2.toString(), str3.toString()).collect(Collectors.toList());
//        System.out.println("good = " + good);
//
//
//        List<Member> g = new ArrayList<>();
//
//        g.add(new Member("khm",23, "RED"));
//        g.add(new Member("LJH",23, "RED"));
//        g.add(new Member("Jys",23, "RED"));
//        g.add(new Member("eqa",23, "RED"));



//        String[] atest = {"khm", "GOOOOOD", "oddd", "ccc", "GOOD", "aaa", "bbb"};
//
//        List<String> atestList = Arrays.asList(atest);
//
//        Stream<String> aaa = atestList.stream();
//
//        Stream<String> bbb = Arrays.stream(atest);
//
//        bbb.filter(s -> s.length() >= 4).map(String::toLowerCase).sorted().collect(Collectors.toList()).forEach(System.out::println);
//
//        aaa.filter(s -> s.length() == 3).map(String::toUpperCase).sorted().collect(Collectors.toList()).forEach(System.out::println);
//
        List<String> good = Arrays.asList("khm2","khm", "oddd", "biz", "kmm", "kqq", "kaa", "khm");

         good.stream().filter(s -> s.startsWith("k")).map(String::toUpperCase).sorted().distinct().collect(Collectors.toList()).forEach(System.out::println);

    }
}
