package sec07.exam02_method;

public class StringValueOfExample {

	public static void main(String[] args) {
		//�⺻ Ÿ���� ���� ���ڿ��� ��ȯ 
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		System.out.println(str1);  // 10 -> "10", Ÿ�Ժ�ȯ : �⺻�� -> ������
		System.out.println(str2);  // 10.5 -> "10.5"
		System.out.println(str3);  // true -> "true"
	}

}
