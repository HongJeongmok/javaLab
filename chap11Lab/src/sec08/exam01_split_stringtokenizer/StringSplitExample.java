package sec08.exam01_split_stringtokenizer;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] names = text.split("&|,|-");  // 스페이스 주의
		
		for(String name : names) {
			System.out.println(name);
		}
	}

}
