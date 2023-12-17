package study.exceptional;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ResourceClose {
    public static void main(String[] args) {

        Scanner scanner = null;
        try {
            Scanner scanner1 = new Scanner(new File("input.txt"));
            System.out.println(scanner1.nextLine());
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            /** scanner 리소스 반납 **/
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
