package study.whiteship.interable;

public class Main implements CustomCalculator {

    public static void main(String[] args) {
        CustomCalculator demo = new Main();

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sumOfEvens = demo.addEvenNumbers(nums);
        System.out.println(sumOfEvens);

        int sumOfOdds = demo.addOddNumbers(nums);
        System.out.println(sumOfOdds);
    }
}
