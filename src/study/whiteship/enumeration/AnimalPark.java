package study.whiteship.enumeration;

public class AnimalPark {
    public static void main(String[] args) {
        for(Animal a : Animal.values()) {
            System.out.print(a + " ");
        }
    }
}
