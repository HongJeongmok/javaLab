package sec02.exam02_vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
	
		list.add(new Board("����1", "����1", "�۾���1"));  // 0
		list.add(new Board("����2", "����2", "�۾���2"));  // 1
		list.add(new Board("����3", "����3", "�۾���3"));  // 2
		list.add(new Board("����4", "����4", "�۾���4"));  // 3
		list.add(new Board("����5", "����5", "�۾���5"));  // 4
		
		list.remove(2);  // "����3" �������� ���� ����Ʈ�� �����  0 1 (����3) 3 4 -> 0 1 2(����4) 3(����5)
		list.remove(3);  // ����� "����5" ������
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}

