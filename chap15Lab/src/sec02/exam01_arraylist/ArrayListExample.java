package sec02.exam01_arraylist;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");  // 0 자리
		list.add("JDBC");  // 1 자리
		list.add("Servlet/JSP");  // (2)에서 3 자리로 밀려남 
		list.add(2, "Database");  // (2,) 2자리 밀어내기
		list.add("iBATIS");  // 4 자리

		int size = list.size();
		System.out.println("총 객체수: " + size);		
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();

		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
				
		list.remove(2);  // 2자리 지우고 뒷자리가 앞으로 당겨짐 "Database"제거
		list.remove(2);
		list.remove("iBATIS");		
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}

