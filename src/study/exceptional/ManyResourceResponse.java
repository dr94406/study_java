package study.exceptional;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ManyResourceResponse {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("input.txt"))) {
            PrintWriter pw = new PrintWriter(scanner.nextLine());
            System.out.println(scanner.nextLine());
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
