package study.whiteship.exceptional;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {

    private static final int SIZE = 10;

    private List<Integer> list;

    public ListOfNumbers() {
        list = new ArrayList<>(SIZE);
        for(int i = 0; i < SIZE; i++) {
            list.add(i);
        }
    }

    public void writeList() throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

        for(int i = 0; i < SIZE; i++) {
            out.println("Value at: " + 1 + " = " + list.get(i));
        }
        out.close();
    }
}
