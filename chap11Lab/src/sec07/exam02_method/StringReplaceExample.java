package sec07.exam02_method;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldstr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldstr.replaceAll("자바", "java");  // 기존 객체에 덮어쓰기x 새로운 객체 생성 후 해당 문자열로 대치
		
		System.out.println(oldstr);
		System.out.println(newStr);

	}

}
