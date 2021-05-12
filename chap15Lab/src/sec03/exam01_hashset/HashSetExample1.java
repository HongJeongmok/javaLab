<<<<<<< HEAD
package sec03.exam01_hashset;

import java.util.*;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");  // 중복으로 덮어쓰기
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		Iterator<String> iterator = set.iterator();  // 전체 객체를 대상으로 한 번씩 반복해 가져오는 반복자(Iterator)
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		//  iterator 없이 향상된 for문 사용
		for(String element : set) {
			System.out.println("\t" + element);
		}
		set.clear();		
		if(set.isEmpty()) { System.out.println("비어 있음"); }
	}
}

=======
package sec03.exam01_hashset;

import java.util.*;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");  // 중복으로 덮어쓰기
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		Iterator<String> iterator = set.iterator();  // 전체 객체를 대상으로 한 번씩 반복해 가져오는 반복자(Iterator)
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		//  iterator 없이 향상된 for문 사용
		for(String element : set) {
			System.out.println("\t" + element);
		}
		set.clear();		
		if(set.isEmpty()) { System.out.println("비어 있음"); }
	}
}

>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
