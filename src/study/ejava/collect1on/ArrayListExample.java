package study.ejava.collect1on;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();

		list.add(new Board("zzz" ," Xxx", "cccC "));
		list.add(new Board("zzz1" ," Xxx", "cccC "));
		list.add(new Board("zzz2" ," Xxx", "cccC "));
		list.add(new Board("zzz3" ," Xxx", "cccC "));

		int size = list.size();
		System.out.println("size = " + size);
		System.out.println();

		Board board = list.get(2);
		System.out.println(board.getSubject() + ", " + board.getContent() + " , " +  board.getWriter());

		System.out.println();

		for(int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject() + " , " + b.getContent() + " , " + b.getWriter());
		}
		System.out.println();


			list.remove(2);
			list.remove(2);

		for (Board b : list) {
			System.out.println(b.getSubject() + " , " + b.getContent() + " , "  + b.getWriter());
			}
		}
	}
