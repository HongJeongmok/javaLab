package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		// �������̽� ���� = ������ü, �ڵ�Ÿ�Ժ�ȯ
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare();
		
		Bus bus = (Bus) vehicle;  // ��������ȯ, ����Ŭ������ <- �������̽���
		bus.run();
		bus.checkFare();

	}

}