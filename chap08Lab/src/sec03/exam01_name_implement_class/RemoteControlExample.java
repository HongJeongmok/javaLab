package sec03.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ú��� rc�� RemoteControl �������̽� Ÿ���̴�.
		/*RemoteControl rc;*/ // ���� rc = new Television();
		RemoteControl rc = new Television();  // �������̽� ���� = ������ü; �ڵ�����ȯ
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);  // ��ӹ��� ����Ʈ�޼ҵ�
		rc.turnOff();
		System.out.println("--------------------");
		rc = new Audio();  // �������̽� Ÿ�� = Audio ������ü, �ڵ�����ȯ
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(false);  // ��ӹ��� ����Ʈ�޼ҵ�
		rc.turnOff();

	}

}
