package sec07.exam02_method;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldstr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldstr.replaceAll("�ڹ�", "java");  // ���� ��ü�� �����x ���ο� ��ü ���� �� �ش� ���ڿ��� ��ġ
		
		System.out.println(oldstr);
		System.out.println(newStr);

	}

}
