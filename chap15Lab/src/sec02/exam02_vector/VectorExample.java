<<<<<<< HEAD
package sec02.exam02_vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
	
		list.add(new Board("제목1", "내용1", "글쓴이1"));  // 0
		list.add(new Board("제목2", "내용2", "글쓴이2"));  // 1
		list.add(new Board("제목3", "내용3", "글쓴이3"));  // 2
		list.add(new Board("제목4", "내용4", "글쓴이4"));  // 3
		list.add(new Board("제목5", "내용5", "글쓴이5"));  // 4
		
		list.remove(2);  // "제목3" 지워지고 다음 리스트가 당겨짐  0 1 (제목3) 3 4 -> 0 1 2(제목4) 3(제목5)
		list.remove(3);  // 당겨진 "제목5" 지워짐
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}

=======
package sec02.exam02_vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
	
		list.add(new Board("제목1", "내용1", "글쓴이1"));  // 0
		list.add(new Board("제목2", "내용2", "글쓴이2"));  // 1
		list.add(new Board("제목3", "내용3", "글쓴이3"));  // 2
		list.add(new Board("제목4", "내용4", "글쓴이4"));  // 3
		list.add(new Board("제목5", "내용5", "글쓴이5"));  // 4
		
		list.remove(2);  // "제목3" 지워지고 다음 리스트가 당겨짐  0 1 (제목3) 3 4 -> 0 1 2(제목4) 3(제목5)
		list.remove(3);  // 당겨진 "제목5" 지워짐
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}

>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
