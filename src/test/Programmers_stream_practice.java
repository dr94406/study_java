package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.*;
import static java.util.Collections.*;

public class Programmers_stream_practice {

    @Test
    public void average() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        var sum = Arrays.stream(numbers).average().getAsDouble();
        out.println(sum);
    }

    @Test
    void Strings() throws IOException {
        StringBuilder builder = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
        BufferedReader br = new BufferedReader(new InputStreamReader(in));


        String my_string = "cvsgiorszzzmrpaqpe";
//        String my_string = br.readLine();



        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

        Arrays.stream(index_list)
                .forEach(number -> builder.append(my_string.charAt(number)));

        String answer = builder.toString();

        bw.write(answer);
        bw.flush();

        Assertions.assertEquals(answer, "programmers");
    }

    /**
     * 스트림 풀이
     * return Arrays.stream(indexList).mapToObj(operand -> String.valueOf(myString.charAt(operand))).collect(Collectors.joining());
     */

    @Test
    void arrayElementsLength() {
        String[] strList = {"We", "are", "the", "world!"};

        List<Integer> collect = Arrays.stream(strList)
                .map(String::length)
                .collect(Collectors.toList());

        out.println(collect);
    }

    @Test
    void arraysDoubleValue() {
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};

        IntStream stream = Arrays.stream(numbers);


        IntStream intStream = stream.map(s -> s * 2);
        intStream.boxed().collect(Collectors.toList());
    }

    @Test
    void duplicateValue() {
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;
        AtomicInteger answer = new AtomicInteger();

        List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());
        int value = (int) arrayList.stream().filter(s -> s.equals(n)).count();
    }

    @Test
    void filter() {
        int[] array = {149, 180, 192, 170};
        int b = 167;

        List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());

        int value = (int) arrayList.stream().filter(s -> s.intValue() > b).count();
        out.println(value);
    }

    @Test
    void arrayReverse() {
        int[] array = {1, 0, 1, 1, 1, 3, 5};
        List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());
        reverse(arrayList);
        out.println(arrayList);
    }

    @Test
    void reverseString() {
        String my_string = "jaron";
        StringBuilder stringBuilder = new StringBuilder(my_string).reverse();
        out.println(stringBuilder);
    }

    @Test
    void end5() {
        int[] array = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};

        List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());
        arrayList.stream().sorted().skip(5).collect(Collectors.toList());
    }

    @Test
    void 홀짝() {
        int n = 10;
        var intStream = IntStream.rangeClosed(0, n).boxed().collect(Collectors.toList());
        int odd = intStream.stream().filter(s -> s % 2 != 0).mapToInt(number -> number).sum();
        int even = intStream.stream().filter(a -> a % 2 == 0).mapToInt(number -> number * number).sum();
        out.println(odd);
        out.println(even);
    }

    @Test
    void n() {
        int[] numbers = {1,2,3,4,5};
        int n1 = 1;
        int n2 = 3;

        var a = IntStream.rangeClosed(numbers[n1], numbers[n2]).boxed().collect(Collectors.toList());
        out.println(a);
    }

    @Test
    void 배열_만들기_1() {
        int n = 10;
        int k = 3;
        var range = IntStream.range(k, n +1).filter(s -> s % k == 0).boxed().collect(Collectors.toList());
        out.println(range);
    }

    @Test
    void 원소들의_곱과_합(){
        int[] num_list = {5,7,8,3};
        long sum = Arrays.stream(num_list).reduce(0, (a,b) -> a + b);
        long sum2 = sum * sum;
        out.println(sum2);
        long multiple = Arrays.stream(num_list).reduce(1, (a,b) -> a * b);

        out.println(sum);
        out.println(multiple);
    }

    @Test
    void 홀수vs짝수() {
        int[] num_list = {4,2,6,1,7,6};
        int answer = 0;
        for(int i = 0; i <= num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                answer += i;
                out.print(answer);
            }
        }

    }
}
