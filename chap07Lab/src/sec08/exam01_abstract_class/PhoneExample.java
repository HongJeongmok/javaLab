package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		// Cannot instantiate the type Phone
		// Phone phone = new Phone("ȫ�浿"); // �߻�Ŭ������ ��ü�� ���� �� ����.
		
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}

}