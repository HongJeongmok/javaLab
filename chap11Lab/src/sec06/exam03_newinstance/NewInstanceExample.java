package sec06.exam03_newinstance;

public class NewInstanceExample {

	public static void main(String[] args) {
		
		try {
			// Class clazz = Class.forName("sec06.exam03_newinstance.SendAction");  // �����͸� �����ϴ�.
			// Class clazz = Class.forName("sec06.exam03_newinstance.ReceiveAction");  // �����͸� �޽��ϴ�.
			Class clazz = Class.forName(args[0]);  // �����͸� �޽��ϴ�.
			Action action = (Action) clazz.newInstance();  // SendAction ���� ��ü �����Ѵ�.
			action.execute();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(InstantiationException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
